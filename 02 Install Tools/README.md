# Install Android Studio on Windows
## STEPS: 
   1. If you have downloaded .exe file of Andorid Studio, just double click on it to install.
   2. If you have downloaded .zip file of Android Studio, then just extract it somewhare on your PC.
   > Download Andorid studio [Click here](https://developer.android.com/studio/).
   3. Go to android-studio -> bin folder then, double click on "studio64.exe" (for 64-bit machines) or "studio.exe" (for 32-bit machines).
   4. Just follow the setup procedure, it is as similar as any other software installations.
   > Watch the video [Click here](https://developer.android.com/studio/videos/studio-install-windows.mp4)
   5. Remember to intall all necessary SDKs to install during installtion of android studio.
   
# Install Android Studio on MacOS
## STEPS: 
   1. Launch the Android Studio DMG file.
   2. Drag and drop Android Studio into the Applications folder, then launch Android Studio.
   > Download Andorid studio [Click here](https://developer.android.com/studio/).
   3. Select whether you want to import previous Android Studio settings, then click OK.
   4. The Android Studio Setup Wizard guides you through the rest of the setup, which includes downloading Android SDK components that are required for development.
   > Watch the video [Click here](https://developer.android.com/studio/videos/studio-install-mac.mp4)
   
# Install Android Studio on Linux
## STEPS: 
   1. Unpack the .zip file you downloaded to an appropriate location for your applications, such as within /usr/local/ for your user profile, or /opt/ for shared users.
   2. To launch Android Studio, open a terminal, navigate to the android-studio/bin/ directory, and execute studio.sh .
   > Download Andorid studio [Click here](https://developer.android.com/studio/).
   3. Select whether you want to import previous Android Studio settings or not, then click OK.
   4. The Android Studio Setup Wizard guides you through the rest of the setup, which includes downloading Android SDK components that are required for development.
   > Watch the video [Click here](https://developer.android.com/studio/videos/studio-install-linux.mp4)
### Required libraries for 64-bit machines:
If you are running a 64-bit version of Ubuntu, you need to install some 32-bit libraries with the following command:
```
sudo apt-get install libc6:i386 libncurses5:i386 libstdc++6:i386 lib32z1 libbz2-1.0:i386
```
If you are running 64-bit Fedora, the command is:
```
sudo yum install zlib.i686 ncurses-libs.i686 bzip2-libs.i686
```
> To make Android Studio available in your list of applications, select Tools > Create Desktop Entry from the Android Studio menu bar.
