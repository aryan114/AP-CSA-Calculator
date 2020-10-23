# AP-CSA-Calculator-Aryan-and-Pranav: Calculator2 Ideas and Basic Principles

FILES TO RUN:
Main (for running the entire caluclator)
Login.java (this is not hooked up to the main menu yet, so run the Login file individually)
Please look at the CalculatorView form, it doesn't have any code behind it, just the display is the thing we will code over the weekend.

Username to login: coderwithswag
Password to login: Legit

_________________________________________________________________________________________________________________________________________________________________________________

What organization or reuse strategies will lead to minimizing Control and Model code?  MVC?

Model: The model aspect of the code is the overall structure of the code. In our calculator, our model could include the history and anything that "controls" the code. The background processes that take place are part of the model code. This could include setting the variables, changing the display, and etc. In an MVC project, the model code will not change as long as the purpose of the code remains the same. Since the model is the "theoretical" stuff behind the actual program, using the same model will allow us to reuse code. 

View: The code that is responsible for the visual aspect of the project - the GUI. This includes the colors, button placement, font, and etc. This code will stay the same since it just represents what the user sees. Different control and model code could be used under the same view code. So, applying those principles to our calculator, the view code is the code that creates all the buttons, gives them the colors, and defines the lables.

Control: The control code are the if/then statments that basically control the flow of the code. The control would change based on what we want our calculator to do. In a regular scientific calculator, our control code would just be the if/then statements that evaluate the operations based on the the operation clicked. However, in a binary converter, the control code would be the the code that converts the code from binary to decimal based and vice versa.


Our Plan for approaching the MVC Calculator: 

For our MVC calculator, we want to break up the code so that each component is in a separate file. The CalcUI would be a file which basically constructs the overall appearance of the calculator. This would include the JForm GUI Designe. Additionally, the code responsible for the model part is going to be in a separate file. Here, we will include code for storing the history, assigning the variables and what the program should do when certain things happen. The control code will be in a separate file and will serve as the linkage between the view components and the model components. This is how we plan on re-creating the calculator so that different parts of the code could be reused and recycled as needed.

_________________________________________________________________________________________________________________________________________________________________________________



Think about the View impact of coding to alternate platforms in todays computing world? 

The view part of the code is important because first of all, it sets the initial impression for the program. The better it looks, the higher the chances of the user looking/using the program. But from a coding point of view, the view part of MVC is important because it creates the layout for the OS that its being run on. While the view component might be changed in order to match the device/system that it runs on, the general model and control remain the same since the background operations are unchanged.

In our MVC calculator, we will need to change the view component in order to make the code run on both a console and a GUI. For the most part, we can keep the model and the controller code the same because the background operations will be the same. The only parts of the model that might change is the way the variables are stored or etc (since input is being typed, not clicked).


