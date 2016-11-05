# BadRobots2016Redo
Rewrite of the robot code from 2016

## Getting the Code

Clone the git repo into your workspace.

`git clone <url>`

Then in Eclipse go to `File -> Import -> Existing Projects into workspace` and import the project with generic settings.

To configure buildpath select all jar files in `lib/` and right click and select `Build Path -> Add to Build Path`.

### Issues

#### Source Directory
If you get issues with Eclipse not finding thinking `lib/` and `src/` are both source directories right click on the project, select `Properties -> Java Build Path -> Source` and delete the only listing. Then click `Add Folder` and select the `src/` directory.

#### JDK
If your JDK/JRE is not setup go to the Build Path Libraries tab and make sure it is set to a version of Java 8 or greater.
On Windows make sure you have the JDK installed.
On Linux use `java-8-openjdk-amd64` or greater.
