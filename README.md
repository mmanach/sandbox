# Project to reproduce AfterScenario issue
https://github.com/serenity-bdd/serenity-core/issues/896

## Configurations
For now, only tested on Windows 10 and with Chrome and Firefox (both last version).

To run  tests in local, you need to download the browser's drivers :
* chromedriver
* geckodriver

And to set up them in your environment path.


## Run tests
For reproduce this case:

* From the IDE, right click on the runner class : Google (extending SerenityStory)
* Go to the BasePage class and comment the line 25 to make the test green/red
* Check the console log
   
