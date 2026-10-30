# My Android Calculator 🧮

**My first Android project — where my Android development journey began. 🌱**

This calculator is where I took my first steps as an Android developer: putting together a screen full of buttons, connecting XML layouts to Java code, and figuring out how to turn button taps into a result on the screen.

The first commits in this repository date back to January 2022. The code captures that time: my early decisions, experiments, and the things I was still learning. I'm keeping this project as a reminder of where my journey in Android development started.

## ✨ Features

- Addition, subtraction, multiplication, and division.
- Decimal number input.
- Percentage calculations.
- Input clearing and a button for deleting the last character.
- A simple interface with a numeric keypad and a large input display.

This is a learning project with some limitations and unfinished experiments. For example, the `+/-` button is present in the interface, but its click handler has not been implemented.

## 📚 What I Learned

- Building an XML layout with `LinearLayout`, `TableLayout`, and `TableRow`.
- Working with an `Activity`, buttons, `TextView`, and click listeners.
- Managing input state and implementing arithmetic operations in Java.
- Using Android resources: strings, themes, and a custom font.
- Understanding the structure of an Android project and configuring its Gradle build.

## 🛠️ Tech Stack

| Component | Used in This Project |
| --- | --- |
| Language | Java, with Java 8 compatibility |
| UI | XML / Android Views |
| UI Libraries | AndroidX AppCompat, Material Components |
| Build Tools | Gradle 7.0.2, Android Gradle Plugin 7.0.3 |
| Minimum Android Version | Android 8.0 — API 26 |
| Compile SDK / Target SDK | API 30 |

The calculator logic lives in `app/src/main/java/com/example/myprojectiscalculator/MainActivity.java`, and the screen layout is in `app/src/main/res/layout/activity_main.xml`.

## 🚀 Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/PavkaBrika/My-Android-Calculator.git
   ```

2. Open the project folder in Android Studio.
3. For the original build configuration, select **JDK 11** as the Gradle JDK. See the [Android Gradle Plugin 7.0 JDK requirements](https://developer.android.com/build/releases/agp-7-0-0-release-notes#jdk-11).
4. Install **Android SDK Platform 30** through SDK Manager and run Gradle Sync.
5. Run the `app` module on an emulator or device with **Android 8.0 or later**.

---

Author: [PavkaBrika](https://github.com/PavkaBrika)
