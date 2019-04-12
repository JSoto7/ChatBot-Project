public class Chatbot 
{ 
  // properties (aka data members, attributes, etc)
  private String myLanguage;
  private String myName;
  
  /**
   * Default constructor
   */
  public Chatbot()
  {
    myLanguage = "English";
    myName = "";
  }

	/**
	 * Gives a greeting to a user
	 * 
	 * @return a suitable greeting message
	 */
  public String getGreeting() 
  { 
    return "Hello"; 
  } 

	/**
	 * Gives a farewell message to a user
	 * 
	 * @return a suitable farewell message
	 */
  public String getGoodbye() 
  { 
    return "Goodbye"; 
  } 
    
	/**
	 * Accesses a chatbot's name
	 * 
	 * @return the name of the chatbot object
	 */
  public String getName() 
  { 
    return myName; 
  } 

	/**
	 * Accesses a chatbot's language
	 * 
	 * @return the language in use by the chatbot
	 */
  public String getLanguage() 
  { 
    return myLanguage; 
  } 

}// end of Chatbot class
