This zip file contains two folders: WorkspaceProjects and runtimeProject

WorkspaceProjects should be copied in your working workspace. 
This is the same folder (or type of folder) where you created your metamodels before.

WorkspaceProjects contains 5 projects. All but xtext.robocode.generator are automatically generated and should not be modified. 
All your modifications should be done in the xtext.robocode.generator project.

In case you encounter problems with these projects, you could follow these steps:
	1. Create an xText project (ideally set the expension to robotGenerator, or make sure to remember what your extension was)
	2. Copy the Generator.xtext file contents in your xText file from the new project
	3. Run to generate the xText artifacts



runtimeProject should be placed in your runtime folder. 
This is the same folder (or type of folder) where you have modelled your three robots for the previous assignment. 
It is the workspace you get when you run a project as Eclipse application.

runtimeProject contains a file with the extension robotGenerator. This file is the xtext model of the SpinBot.
When you make modifications to your xTend specifications and you want to test them, run the workspace project as Eclipse Application. 
Then, make a minor modification in the SpinBotModel.robotGenerator file (delete and rewrite a lette ror something) and save. 
The generated file should be modified.

In case you encounter problems with this project, you could follow these steps:
	1. Create a Java Project in the runtime
	2. Create a file with the extension you defined when creating your xText project (robotGenerator in case you are using the given workspace projects)
	3. The window should be loading for a while and then it should ask if you want to make the project an xText project. Agree to do so.
	4. Copy the contents of SpinBotModel.robotGenerator into your new file and save
	5. In case you already have specified xTend rules and no src-gen folder is created, manually create a Source Folder with the name src-gen. 
	6. If it remain empty, you probably have some errors or problems in your xTend specifications.