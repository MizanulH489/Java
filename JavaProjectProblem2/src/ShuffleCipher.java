import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


class ShuffleCipher extends Cipher implements MessageEncoder, MessageDecoder {
    private int NoShuffle;

    public ShuffleCipher(int NoShuffle) {
        this.NoShuffle = NoShuffle;
    }

    public String cipherType(){
        return "ShuffleCipher";
    }

    public String encode(String plainText){
        StringBuilder encoded = new StringBuilder();
        int mid = plainText.length() / 2;
        for(int i=0; i<NoShuffle; i++){
            String h1 = "";
            String h2 = "";
            // if plainText length is odd first half should be longer
            if((plainText.length() & 1) == 1){
                h1 = plainText.substring(0, mid+1);
                h2 = plainText.substring(mid+1);

                // get first char out of the way to balance loop
                encoded.append(h1.charAt(0));
                for (int j=0; j < mid; j++) {
                    encoded.append(h2.charAt(j));
                    encoded.append(h1.charAt(j+1));
                }
            }
            else
            {
                h1 = plainText.substring(0, mid);
                h2 = plainText.substring(mid);
                for (int j=0; j < mid; j++) {
                    encoded.append(h1.charAt(j));
                    encoded.append(h2.charAt(j));
                }
            }
            plainText = encoded.toString();
        }
        return encoded.toString();
    }

    public String decode(String cipherText){
        StringBuilder decoded = new StringBuilder();

        for(int i=0; i<NoShuffle; i++){
            String h1 = "";
            String h2 = "";
            // if plainText length is odd
            // the last of the cipher should be
            // added to the first half

            for (int j=0; j < cipherText.length() - 1; j+=2) {
                h1 += cipherText.substring(j, j+1);
                h2 += cipherText.substring(j+1, j+2);

            }
            if((cipherText.length() & 1) == 1){
                h1 += cipherText.substring(cipherText.length()-1);
            }

            decoded.append(h1);
            decoded.append(h2);
            cipherText = decoded.toString();
        }
        return decoded.toString();
    }
}