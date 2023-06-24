package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();

		//this is testing if the secret code is 0 (most likely will result in "false")
		System.out.println(vault.tryCode(0));

		
		
		
		SecretAgent agent = new SecretAgent();
		
		//this finds the secret code by trying all of the possible codes
		System.out.println(agent.findCode(vault));

		

	}	

}
