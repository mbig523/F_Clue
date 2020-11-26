public class Card {
	
	//Variables
		private String cardType; // This is for Weapons, Suspects, Rooms
		private String name;
	
	//Constructor
		public Card (String cardType, String name) {
			this.cardType = cardType;
			this.name = name;
		}
	
	//Getters & Setters
		public String getCardType() {
			return this.cardType;
		}
		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
		public String getName() {
			return this.name;
		}
		public void setCardType(String name) {
			this.name = name;
		}
	
	//Other Methods
		public boolean match (Card a) { //Returns whether or not another card matches 
			if (a.getCardType() == this.cardType && a.getName() == this.name) return true;
			return false;
		}
	
	
	//Detective Card
	private Suggestion solution;
	private Map<Character, Set<Card>> knownCard;
	
	public void createSolution() {
		// after the character, weapon, and location cards code
		Solution = new Suggestion(solutionCharacter, solutionWeapon, solutionLocation);
	}
	
	public String refutreSuggestion(Suggestion suggest) {
		Set<cardType> knownCardsForPlayer = knownCard.get(currentPlayer);
		
		List<cardType> cardsSuggestion = suggest.asList();
		Collections.shuffle(cardsSuggestion);
	}
		
}
