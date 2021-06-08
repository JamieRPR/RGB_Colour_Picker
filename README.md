RGB Colour Picker Android App
=============================

This is a sample Android App that allows users to preview RGB colours by altering the R,G & B components independantly.

## Building the Sample App

First, clone the repo:

`gh repo clone git@github.com:JamieRPR/RGB_Color_Picker.git`

### Android Studio (Recommended)

(These instructions were tested with Android Studio version 4.2.1)

* Open Android Studio and select `File->Open...` or from the Android Launcher select `Import project (Eclipse ADT, Gradle, etc.)` and navigate to the root directory of your project.
* Select the directory or drill in and select the file `build.gradle` in the cloned repo.
* Click 'OK' to open the the project in Android Studio.
* A Gradle sync should start, but you can force a sync and build the 'app' module as needed.

### Gradle (command line)

* Build the APK: `./gradlew build`

## Running the Sample App

Connect an Android device to your development machine OR use a virtual device by selecting `Tools -> AVD Manager -> Create Virtual Device` 

### Android Studio

* Select `Run -> Run 'app'` (or `Debug 'app'`) from the menu bar
* Select the device you wish to run the app on and click 'OK'


## Using the Sample App

Use the three sliders to change each coresponding RGB value. 
The background will change to the colour of the given RGB value.
