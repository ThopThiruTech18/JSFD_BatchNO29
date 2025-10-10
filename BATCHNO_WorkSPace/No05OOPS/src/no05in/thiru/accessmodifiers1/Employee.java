package no05in.thiru.accessmodifiers1;

public class Employee {
	
	private String privateMsg = "Private Message";
    String defaultMsg = "Default Message";           // No modifier = default
    protected String protectedMsg = "Protected Message";
    public String publicMsg = "Public Message";

    public void showMessages() {
        System.out.println(privateMsg);
        System.out.println(defaultMsg);
        System.out.println(protectedMsg);
        System.out.println(publicMsg);
    }

}
