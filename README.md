FinalProject
============

1.5.15
I) Main folder containing files for final project.

Final project: text-based adventure game with multiple modules
A. Get an item from a dungeon
B. Fight x monsters
C. Escape the room
D. Story mode: you go through a 'story' and then is quizzed at the end. If you pass the quiz then you'll win the game.
E. More examples!
Save and load function?

II) Made WorldGrid.java, which will set up the grid for the game 

1.6.15
I) Finished basic WorldGrid.java (able to set up an empty grid)
II) Now testing by inputting sample rooms, schnitzel and noodles. 
III) New class 'Rooms.java' made 
IV) Working on accepting input from a file for description of rooms 

1.7.15
I) Continuing work on accepting input from a file for description of rooms 
A. Can accept inputs from a file, working on how to store multiple phrases. 
B. Made importRoomsFromFile capable of splitting at "-" to signify different rooms. 

1.8.15
I) Discussion of how to assign IDs to rooms and link rooms together. 
II) importRoomsFromFile now imports descriptions of all rooms into a 2D Object array 'rooms'. [][this part is filled]

1.9.15
I) Planning to add an inventory array to Character Classes
II) Drafting of character classes
III) Brian working on Rooms.java
IV) items, descriptions, and other things 
V) Refocusing methodology, attempting to build just one room first.

1.12.15
I) WorldGrid.java sets up world
II) Room.java creates different rooms
III) Working on Items.java to 'make' different items 
IV) Room.java completed, I'm updating it so it can A) import all rooms B) store in an array C) any can be called at once 

1.13.15
I) Working on items.java: creating items class that contains a few different identifiers 
II) Trying to dovetail worldgrid and room.java together

1.14.15
I) WorldGrid2 will create a new grid with all descriptions of rooms stored. Room class will refer to WorldGrid2 to match a description with its room ID. 

1.15.15
I) The disparity between what is desired and what is created is never more evident than in my WorldGrid2.java code. Will try to A) import information a) first line sets size of array B) sort descriptions into rooms and give them IDs

1.16.15
I) nullPointerException preventing completion of bridge

1.18.15 
I) Went on a debate tournament, is now fixing prominent problems like the nullPointerException.
A) Attempting to solve for numberFormatException. 
B) ArrayIndexOutOfBounds
II) Overcame arrayIndexOutOfBounds and nullPointer Exception error. 
III) Setting up functions for player movement later on 
IV) Setting up Explorer.java, wondering if STR, INT, and DEX will contribute to game mode, or if we should remove. 
