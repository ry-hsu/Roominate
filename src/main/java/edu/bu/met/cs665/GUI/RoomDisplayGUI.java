package edu.bu.met.cs665.GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

import edu.bu.met.cs665.*;

import java.util.ArrayList;
import java.util.HashMap;

public class RoomDisplayGUI {
    public static ArrayList<Room> house;
    public static HashMap<String,Room> houseRooms;
    public static JPanel centerPanel;
    public static JFrame f;
    public static Boolean buildBed;
    public static Boolean buildDining;

    public static JPanel buildMenuPanel() {
        Border blackline = BorderFactory.createLineBorder(Color.BLACK);
        JPanel menuPanel = new JPanel();
        JLabel roomLabel = new JLabel("Rooms: ");
        JButton diningButton = new JButton("Dining");
        diningButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showDiningRoom();
            }
        });
        if(houseRooms.get("Dining") == null) {
            diningButton.setVisible(false);
        }
        JButton bedButton = new JButton("Bed");
        bedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showBedRoom();
            }
        });
        if(houseRooms.get("Bed") == null) {
            bedButton.setVisible(false);
        }
        menuPanel.add(roomLabel);
        menuPanel.add(diningButton); 
        menuPanel.add(bedButton);
        menuPanel.setBorder(blackline);

        return menuPanel;
    }

    public static void buildHouse() {
        System.out.println("Building start");
        house = new ArrayList<Room>();
        houseRooms = new HashMap<String,Room>();
        RoomBuilder bb = new BedroomBuilder();  
        house.add(bb.getRoom());
        houseRooms.put("Bed", bb.getRoom());
    
        RoomBuilder db = new DiningRoomBuilder();
        house.add(db.getRoom());
        houseRooms.put("Dining", db.getRoom()); 

        System.out.println("Building done");

        centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);

        f.getContentPane().removeAll();
        JPanel menuPanel = buildMenuPanel();
        f.getContentPane().add(BorderLayout.NORTH, menuPanel);
        f.getContentPane().add(BorderLayout.CENTER, centerPanel);
        f.revalidate();
        f.repaint();

        JOptionPane.showMessageDialog(f,"Dining and Bedroom available for viewing");
    }

    public static void showDiningRoom() {
        Room dining = houseRooms.get("Dining");

        DrawFurniture df = new DrawFurniture(dining.getFurniture());
        df.setBackground(Color.WHITE);
        repaintCenter(df);
    }

    public static void showBedRoom() {
        Room dining = houseRooms.get("Bed");

        DrawFurniture df = new DrawFurniture(dining.getFurniture());
        df.setBackground(Color.WHITE);
        repaintCenter(df);
    }

    public static void repaintCenter(DrawFurniture df) {
        f.getContentPane().remove(centerPanel);
        f.getContentPane().add(BorderLayout.CENTER,df);
        f.revalidate();
        f.repaint();
    }

    public static void main(String args[]){
        f=new JFrame(); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        buildHouse();

        f.setSize(600,700);
        f.setVisible(true); 
    }    

}
