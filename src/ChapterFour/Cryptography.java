package ChapterFour;
/*
        (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
        and data storage on Internet-connected computers has greatly increased privacy concerns. The field
        of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
        advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
        simple scheme for encrypting and decrypting data. A company that wants to send data over the Internet
        has asked you to write a program that will encrypt it so that it may be transmitted more
        securely. All the data is transmitted as four-digit integers. Your application should read a four-digit
        integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
        to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
        with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
        a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
        encryption scheme) to form the original number. [Optional reading project: Research “public key
        cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
        also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
 */
import java.util.Scanner;

public class Cryptography {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a four digit number: ");
            int userInput = scan.nextInt();

            int firstDigit = userInput / 1000;
            int firstDigitRemainder = userInput % 1000;
            int secondDigit = firstDigitRemainder/100;
            int secondDigitRemainder = firstDigitRemainder % 100;
            int thirdDigit = secondDigitRemainder/ 10;
            int thirdDigitRemainder = secondDigitRemainder % 10;
            int fourthDigit = thirdDigitRemainder;

            int encryptedFirstDigit = (firstDigit +7) % 10;
            int encryptedSecondDigit = (secondDigit +7) % 10;
            int encryptedThirdDigit =(thirdDigit +7) %10;
            int encryptedFourthDigit = (fourthDigit);
            System.out.printf("%d%n%d%n%d%n%d", encryptedFirstDigit, encryptedSecondDigit, encryptedThirdDigit, encryptedFourthDigit);
        }
    }
