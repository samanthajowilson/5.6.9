
onEvent("submitBtn", "click", function( ) {
  var userName = getText("name_input");
  var userAge = getText("age_input");
  userName = userName.toUpperCase();
setText("text_area1", "Hello, " + userName + "! Welcome to my application! You must be " + userAge + "!");
});
