# Sandbox to reproduce issues

* AfterScenario with Serenity 
    * https://github.com/serenity-bdd/serenity-core/issues/896 

* React dropdown / aria-describedby and geckodriver 
    * https://github.com/mozilla/geckodriver/issues/962/

## Configurations
For now, only tested on Windows 10 and with Chrome and Firefox (both last version).

To run  tests in local, you need to download the browser's drivers :
* chromedriver
* geckodriver

And to set up them in your environment path.


## AfterScenario with Serenity 
For reproduce this case:

* From the IDE, right click on the runner class : Google (extending SerenityStory)
* Go to the BasePage class and comment the line 25 to make the test green/red
* Check the console log

## React dropdown / aria-describedby and geckodriver 
For reproduce this case:

* From the IDE, right click on the runner class : UiAction (extending SerenityStory)
* Check screenshots on https://github.com/mozilla/geckodriver/issues/962/ to see what results are actual / expected
* Modify the browser on serenity.properties to check the expected behavior on chrome
   
