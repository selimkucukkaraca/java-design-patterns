package facade;

public class EncryptorFacade {

    private final AESEncryptor aesEncryptor = new AESEncryptor();
    private final MD5Encryptor md5Encryptor = new MD5Encryptor();
    private final SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text,EncType encType){
        switch (encType){
            case AES:aesEncryptor.encrypt(text); break;
            case MD5:md5Encryptor.encrypt(text,"KEY"); break;
            case SHA:shaEncryptor.encrypt(text,"KEY",true);
            default:throw new IllegalArgumentException(encType.toString());
        }
    }

    public enum EncType {
        SHA,
        MD5,
        AES
    }
}
