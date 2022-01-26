import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


class SubstitutionCipher extends Cipher implements MessageEncoder, MessageDecoder {

    private int shift;
    public SubstitutionCipher(int shift) {
        this.shift = shift;
    }

    public String cipherType(){
        return "SubstitutionCipher";
    }

    public String encode(String plainText){
        StringBuilder encoded = new StringBuilder();
        for (int i=0; i< plainText.length(); i++){
            char cur = plainText.charAt(i);
            if (cur == ' '){
                encoded.append(cur);
                continue;
            }
            int val = cur;
            val += shift;
            encoded.append((char)val);
        }
        return encoded.toString();
    }
    public String decode(String cipherText){
        StringBuilder decoded = new StringBuilder();
        for (int i=0; i< cipherText.length(); i++){
            char cur = cipherText.charAt(i);
            if (cur == ' '){
                decoded.append(cur);
                continue;
            }
            int val = cur;
            val -= shift;
            decoded.append((char)val);
        }
        return decoded.toString();
    }
}