# Ptetrasos
Alternatively known as the Psychology Term That's Easy To Remember And Search On Steam (the P is silent). A game written using the popular LibGDX game development framework for Java, specifically for the web. The story has not yet been finalized.

## Building
On Windows and Unix systems, build by using the `gradlew` or `gradlew.bat` respectively. Running the command
```bash
gradlew superDev
```
will launch a development server on port 8080 (not 9876 as Gradle claims). Note that the first time compilation takes significantly longer than subsequent ones.

## TODO
- [ ] Rendering and position systems
  - [ ] Changing size based on y position (tentative)
  - [ ] Conversion of coordinates between 2D orthogonal and chosen view angle
  - [x] Recursively loading assets via AssetManager (achieved via a text file containing a list of all assets)
  - [ ] Shader applications
- [ ] Level rendering
  - [ ] Filetype and order of layers
  - [ ] Dynamic background
- [ ] Player interactions
  - [ ] Movement
  - [ ] Interaction with in-game objects
  - [ ] Dialogue
  - [ ] Choice mechanic with *biased* cursor

