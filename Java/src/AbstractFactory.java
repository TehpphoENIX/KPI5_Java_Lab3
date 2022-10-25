public class AbstractFactory getFactory(String factories) {
		switch (factories) {
		case "WhiteFactory":
			return new WhiteFactory();
		case "BlackFactory":
			return new BlackFactory();
		default:
			throw new RuntimeException("ERROR");
		}
}
