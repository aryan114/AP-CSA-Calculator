# AP-CSA-Calculator-Aryan-and-Pranav: Calculator2 Ideas and Basic Principles
Week 8:

Pranav
Goals:

Improve the View aspect of the Login GUI (add color and make it look better)

Be able to consequently open the right panels in the right order (code the JFrames so that they open and close in the right order)

Get started on the code for the New User JFrame

Since I’m not yet completely familiar with JFrame, my goal is to feel very confident with the swing this week


My score is a 19/20 for this week's grading. I was able to meet all my goals this week. For example, I was created the New User frame and brushed up its aesthetics [].
I was also able to add code that opened the panels in the right order (NewUser panel opens up when New Account button is clicked) []. I got started on code for the NewUser panel so that users can make their own account when they need to access project, but this is still a work in progress. This code is commented out as it doesn't work yet []. I'll be working on this over the weekend. I also feel better with the JFrame and Swing commands after working on the Login stuff. Therefore, because I feel like I reasonably achieved my goals, my score is a 19/20.

Scrum Master score:

| Goals | Scoring |
| --- | --- |
| Improve the View aspect of the Login GUI (add color and make it look better) | Added color to all the JFrames instead of the regular grey look [] |
| Be able to consequently open the right panels in the right order (code the JFrames so that they open and close in the right order) | Panels open in correct order [] |
| Get started on the code for the New User JFrame | Code doesn't work yet, so it's commented out, but I was able to get the credentials to store in a hashmap [] |
| Since I’m not yet completely familiar with JFrame, my goal is to feel very confident with the swing this week | I feel much better with JFrames/Swing, proof is Login Panels [] |

_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

Aryan Goals:

_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

Praveen Goals:

Scrum Master score:

_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

Arnav Goals:

Scrum Master score:

_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _












_________________________________________________________________________________________________________________________________________________________________________________
_________________________________________________________________________________________________________________________________________________________________________________
_________________________________________________________________________________________________________________________________________________________________________________

FILES TO RUN:
Main (for running the entire caluclator)
Login.java (this is not hooked up to the main menu yet, so run the Login file individually)
Please look at the CalculatorView form, it doesn't have any code behind it, just the display is the thing we will code over the weekend.

Username to login: coderwithswag                                                                                                                                          


Password to login: Legit

_________________________________________________________________________________________________________________________________________________________________________________

1. Ah ha participation 5 pts

2. Self grade. Show how you have engaged  in  your assignment.  Site an individual checkin, individual block of code that has your name in the data  5 pts

3. Scrum team grade. Let your code, readme, comments, and UI  do the talking for your project 15 pts

1. Pranav presented during the Aha presentation and talked about the JFrame. Our A Ha moment was our conceptual understanding of JPanels and JFrames. We understood that all the UI changes were made to the JPanel which was then added to the JFrame. The JFrame is kind of like the container which stores the JPanel and displays that.

2. Aryan - 4/5. This week I tried to experiment with BlueJ and also tried brainstorming several ideas for the new MVC Calculator GUI. However, I was not able to add the code to the new GUI form over the weekend and therefore I docked myself a point. I also was not able to get a diagram of the relationships between Model, View, Control in BlueJ. 

2. Pranav - 4/5. This week I spent a lot of time trying to understand MVC since this concept is pretty new for me. I outlined our ideas for the Calculator2 Project and how we could start it. In addition to understanding the fundamentals, I also worked on the Login UI. While this wasn't super complex, I just got started on it and I'm going to expand it over the next few days.

Praveen - 4/5. This week, I spent a lot of time learning about Jframe, and appying the concepts to code in GUI java. I am not used to this form factor, so I spent a lot of time reviewing youtube videos in order to familiarize myself with the project. I did a little bit of coding, with redirecting the login UI to the main menu, and also spent time on the GUI for my ecommerce website, adding the basic buttons and overall layout. I took off a point because I felt like I could have dome more in terms of code, rather than spend so much time researching.

3. 14/15 we gave ourselves this score because we couldn't work on implementing the code behind our new Calculator GUI. Also we didn't add any new funcitons to the calculator
this week.

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


