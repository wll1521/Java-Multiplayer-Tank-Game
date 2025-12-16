SYNCHRONIZED DESTRUCTION
A Real-Time Multiplayer Java Tank Game
=====================================

Authors:
William Locklier
Parker Cole


OVERVIEW
--------
Synchronized Destruction is a real-time, two-player (PvP) multiplayer tank game
implemented in Java. Players connect over a network using a client–server
architecture and engage in a skill-based battle featuring real-time movement,
firing mechanics, and an integrated chat system.

The project demonstrates core concepts in distributed systems, real-time game
logic, and network synchronization using Java’s standard libraries.


FEATURES
--------
- Real-time multiplayer gameplay (2 players)
- Client-server architecture (host / join model)
- TCP/IP socket communication
- Object serialization for game state synchronization
- Real-time tank movement and firing
- Integrated in-game chat panel
- Concurrent networking via multithreading
- Swing-based graphical user interface (GUI)


HOW TO RUN
----------
1. Install IntelliJ IDEA (Images shown in word document):
   https://www.jetbrains.com/idea/

2. Clone the repository (Images shown in word document):
   https://github.com/wll1521/Java-Multiplayer-Tank-Game.git

3. Open the project in IntelliJ IDEA (Images shown in word document).

4. Set the Main class as the Run Configuration (Images shown in word document).

5. Enable multiple instances if testing locally (Images shown in word document):
   Run → Edit Configurations → Allow multiple instances.

6. Run the application (Images shown in word document).


GAMEPLAY INSTRUCTIONS
---------------------
- On launch, choose:
  - Host Game (acts as server)
  - Join Game (connects to host)

- Host:
  Wait for client to connect before proceeding / pressing OK.

- Client:
  Enter host IP address.
  Use "localhost" if running on the same machine.

Controls:
- Arrow Keys: Move tank
- Spacebar: Fire
- Chat Panel: Click text box, type message, press Enter. Focus goes back to GamePanel after.



