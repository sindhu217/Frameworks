Feature: OrangeHRM feature

  #Scenario Outline: Add emplyoee    //to execute n number of times
  @AddEmployee
  Scenario: Add emplyoee
 
    #When enter "<username>", "<password>" and click on login button    //Table format
   
    Then successfully login into application
  
   

  #Examples:
  #|username|password|     //Table format with pipe symbol
  #| Admin|admin123|
  #| Admin|admin123|
  #| Admin|admin123|    //n number of times we can execute
  @EditEmployee
  Scenario: Edit emplyoee

  
    Then successfully login into  and edit application
    
   
    @DeleteEmployee
 Scenario: Delete emplyoee
  
    
    Then successfully login into  and delete application
   
    