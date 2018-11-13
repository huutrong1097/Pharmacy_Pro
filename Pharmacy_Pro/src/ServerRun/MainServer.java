
package ServerRun;

import Controller.ServerControl;
import View.ServerView;
public class MainServer {
    public static void main(String[] args) {
        ServerView view=new ServerView();
        ServerControl control=new ServerControl(view);
    }
}
