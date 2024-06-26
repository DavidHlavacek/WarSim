# ⚔️ War Simulation
This project simulates epic battles between two armies composed of customizable creatures with unique attributes and superpowers. Configure the simulation to run any number of battles and observe detailed statistics of the outcomes. ⚔️🛡️

## Features 🌟
- **Creature Customization**: Create creatures with specific names, health, damage, speed, and special abilities.
- **Special Abilities**: Choose from abilities such as damage reflection, periodic damage increase, invincibility, and healing.
- **Army Building**: Construct two armies by adding customized creatures.
- **Battle Simulation**: Run multiple battles to see which army triumphs.
- **Detailed Statistics**: View win rates, average health remaining, and ultimate winners for both armies.
- **Randomization**: Each creature's base attributes are randomized for every individual fight within a battle, providing realistic variation in outcomes. 🎲

## GitHub Actions 🚀
This project uses GitHub Actions to automate the build and release process. On every push to the main branch, the project is built using Maven, and the resulting JAR file is published as a release. 🚀

## Prerequisites 📋
Before running the War Simulator project, ensure you have the following prerequisites installed on your system:

1. **Java Development Kit (JDK)**:
   
   - Install JDK to compile and run Java applications.
   - **Download Link**: [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://adoptopenjdk.net/)

## Setup and Running 🛠️
1. Download the latest JAR file from the [Releases](https://github.com/DavidHlavacek/WarSim/releases) section.
2. Open a terminal or command prompt.
3. Navigate to the directory where the JAR file is located.
4. Run the JAR file using the following command:
   
   ```
   java -jar WarSim-1.1.jar
   ```
   
## How to Run the Simulation 🎮
1. **Creature Types**: Enter the number of different types of creatures.
2. **Creature Attributes**: Define the attributes for each creature type (name, health, damage, speed, and special ability).
3. **Army 1**: Add creatures to build the first army.
4. **Army 2**: Add creatures to build the second army.
5. **Battle Options**: Choose the number of battles to simulate.
6. **Results**: View detailed statistics and results of the battles.
   
## Future Plans 🌐
Currently, the project is CLI-based, but plans are underway to enhance it with a graphical user interface (GUI) for a better user experience. 🖥️

## Disclaimer ℹ️
This project has only been tested on Windows so far.

## Note on Randomization 📊
No values are fixed; all attributes are base values that are randomized for each fight. The chances are calculated to reflect realistic outcomes. For example, if one army has 100 creatures and the other has 99, the first army will win most battles, but the second army has a chance to win some due to the randomization. 📊
