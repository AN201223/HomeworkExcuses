
package homeworkexcuses;


public class HomeworkExcuses {
    static String[] excusesOne = new String[]{"Hi ! , I am terribly sorry, but I am writing to tell you ", "that I unfortunately have not been able to do my homework as ", "I was so busy / all week.", "Next week I promise to do better", "Yours sincerely, #."};
    static String[] excusesTwo = new String[]{"hi ! , you probably should know ", "ive not done my homework because ", "/ ate it. ", "ill do it at some point i swear ", "\n #"};
    static String[] excusesThree = new String[]{"Ayo !, how are you, I just wanted to let you know ", "that I'm so so incredibly sorry you don't even know how sorry I am but I didn't do my homework this week because ", "/ made me forget about it. ", "Honestly I wont do this again I swear I honestly wont", ""};
    static String[] responses = new String[]{"", "Interesting start but I can't fault you, how are you gonna carry it on", "Ooh are you sure about that, well too late to change your mind now (You have to enter a response into the text box for this one)", "Unusual reason, I suppose that might work", "That was brave"};
    static String[] inputareatext = new String[]{"How do you want to start off?", "So how would you like to break the news?", "What excuse do you want to use?", "How are you going to follow it up?", "How do you want to close your message?"};
    static String[] buttononeoptions = new String[]{"Polite", "Apologetic", "Say you were busy doing something", "Promise to do better in future", "End politely"};
    static String[] buttontwooptions = new String[]{"Act like you dont really care", "Straight to the point", "Blame something eating it", "Unconvincingly promise to do the work", "Just say your name at the end"};
    static String[] buttonthreeoptions = new String[]{"Act like you know the teacher personally", "Act sorry but don't try too hard", "Blame something making you forget", "Convince them you won't do it again (but not really)", "Don't say anything else"};
    public static void main(String[] args) {
       ExcuseGUI gui = new ExcuseGUI();
       gui.setVisible(true);
    }
    
}
