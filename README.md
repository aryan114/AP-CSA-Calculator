# AP-CSA-Calculator-Aryan-and-Pranav

What organization or reuse strategies will lead to minimizing Control and Model code?  MVC?

Model: The model aspect of the code is the overall structure of the code. In our calculator, our model could include the history,  

View: The code that is responsible for the visual aspect of the project - the GUI. This includes the colors, button placement, font, and etc. This code will stay the same since it
just represents what the user sees. Different control and model code could be used under the same view code. So, applying those principles to our calculator, the view code is the 
code that creates all the buttons, gives them the colors, and defines the lables.

Control: The control code are the if/then statments that basically control the flow of the code. The control would change based on what we want our calculator to do. In a regular
scientific calculator, our control code would just be the if/then statements that evaluate the operations based on the the operation clicked. However, in a binary converter, the
control code would be the the code that converts the code from binary to decimal based and vice versa.


For our MVC calculator, we want to break up the code so that each component is in a separate file. The CalcUI would be a file which basically constructs the overall appearance of
the calculator. Additinoally, the code responsible for the model part is going to be in a separate file. Here, we will include code for storing the history



Think about the View impact of coding to alternate platforms in todays computing world? 
Desktops: Windows, MacOS, Linux
Mobile: Android, iPhone

Java has been described as the Write Once Run Anywhere language
