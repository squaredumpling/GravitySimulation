package all;

public class Main {

    public static void main(String[] args){
        new Frame();
        SimPanel.create(10, 0, 4);
        // SimPanel.create(10, 1, 4);
        // SimPanel.create(10, 2, 4);
        // SimPanel.create(10, 3, 4);
    }
}


// TODO: fix conservation of momentum in SimPanel.update()
// TODO: there is a better way to calculate acceleration
// TODO: make optional collisions
// TODO: Merge Main with Frame and name it MainFrame
// TODO: test with higher resolotion (prbably make distance independent of pixels)
// TODO: make interface for config variables (and aothers)
// TODO: make an edit mode where you can add particles
// TODO: panel can be bigger but with camera movement (and a minimap?)
// TODO: move varibles from config into each section
// TODO: make merge delete both particles and create a new one to delete the if