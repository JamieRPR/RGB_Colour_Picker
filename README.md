RGB Colour Picker Android App
=============================

This is a sample Android App that allows users to preview RGB colours by altering the R,G & B components independently.

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

Use the three sliders to change each corresponding RGB value. 
The background will change to the colour of the given RGB value.
Tap on the RGB or HEX value to copy it to your clipboard.

## Design Considerations

This app was designed to be simplistic and easy to use given the time constraints of the project.

### Sliders

The sliders were stacked at the bottom of the user interface so that they would be near the users thumbs, negating the need rearrange grip. They are full width to make it easier to select the desired value, and each thumb colour corresponds to which RGB value you're changing.

### RGB Individual Value Cards

The cards that display each RGB value are stack above the sliders. They are horizontally stacked right above the sliders, so that it's easy for the user to see that moving the slider changes the value. The colour selection on the fonts and background uses different tones and tints of the same colour to bring consistency to the design. The numbers are larger than the labels, are they are what the user will be most focused on. The background on the card also ensures that the background can't be changed in a way that obscures the text.

### RGB & HEX Values

These are positioned equally between the RGB independent value cards and the top of the screen, utilising as much negative space above and below to emphasise their importance. They follow the same colour scheme as the value cards for the same reasons. 