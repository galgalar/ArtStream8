import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class TypesOfArtists extends JPanel implements ActionListener {

    private JPanel main = new JPanel();
    private ImageIcon[] imagesOfTypeOfArtists = 
    {
        new ImageIcon("src\\digitalarts.jpg"),
        new ImageIcon("src\\charcoal.jpg"),
        new ImageIcon("src\\landscape.jpg"),
        new ImageIcon("src\\portrait.jpg")
    };
    private JPanel[] gridPanels = new JPanel[4];
    private JButton[] viewArtistsButton = new JButton[4];

    public TypesOfArtists()
    {

        setSize(1300,1000);
        setBackground(Color.orange);
        setLayout(new BorderLayout());
        JLabel artists = new JLabel("Artists");
       
        add(main,BorderLayout.CENTER);
        add(artists,BorderLayout.NORTH);
        main.setLayout(new GridLayout(0,4,30,0));
        main.setBorder(BorderFactory.createEmptyBorder(50,100,50,100));
  
        for(int i = 0; i < imagesOfTypeOfArtists.length; ++i)
        {
            Image icon = imagesOfTypeOfArtists[i].getImage();
            Image iconResize = icon.getScaledInstance(200,200, Image.SCALE_SMOOTH);
            imagesOfTypeOfArtists[i] = new ImageIcon(iconResize);
            
            if(i == 0)
            {
                JLabel labelWithIcon = new JLabel(imagesOfTypeOfArtists[i]);
                labelWithIcon.setText("Digital Artists");
                labelWithIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
                labelWithIcon.setHorizontalTextPosition(SwingConstants.CENTER);
                gridPanels[i] = new JPanel();
                gridPanels[i].setLayout(new BorderLayout());
                gridPanels[i].add(labelWithIcon,BorderLayout.CENTER);
                viewArtistsButton[i] = new JButton("View Profile");
                viewArtistsButton[i].addActionListener(this);
                gridPanels[i].add(viewArtistsButton[i],BorderLayout.SOUTH);
                main.add(gridPanels[i]);

            }else if(i == 1)
            {
                JLabel labelWithIcon = new JLabel(imagesOfTypeOfArtists[i]);
                labelWithIcon.setText("Charcoal Artists");
                labelWithIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
                labelWithIcon.setHorizontalTextPosition(SwingConstants.CENTER);
                gridPanels[i] = new JPanel();
                gridPanels[i].setLayout(new BorderLayout());
                gridPanels[i].add(labelWithIcon,BorderLayout.CENTER);
                viewArtistsButton[i] = new JButton("View Profile");
                viewArtistsButton[i].addActionListener(this);
                gridPanels[i].add(viewArtistsButton[i],BorderLayout.SOUTH);
                main.add(gridPanels[i]);

            }else if(i == 2)
            {
                JLabel labelWithIcon = new JLabel(imagesOfTypeOfArtists[i]);
                labelWithIcon.setText("Landscape Artists");
                labelWithIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
                labelWithIcon.setHorizontalTextPosition(SwingConstants.CENTER);
                gridPanels[i] = new JPanel();
                gridPanels[i].setLayout(new BorderLayout());
                gridPanels[i].add(labelWithIcon,BorderLayout.CENTER);
                viewArtistsButton[i] = new JButton("View Profile");
                viewArtistsButton[i].addActionListener(this);
                gridPanels[i].add(viewArtistsButton[i],BorderLayout.SOUTH);
                main.add(gridPanels[i]);
            }else
            {
                JLabel labelWithIcon = new JLabel(imagesOfTypeOfArtists[i]);
                labelWithIcon.setText("Portrait Artists");
                labelWithIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
                labelWithIcon.setHorizontalTextPosition(SwingConstants.CENTER);
                gridPanels[i] = new JPanel();
                gridPanels[i].setLayout(new BorderLayout());
                gridPanels[i].add(labelWithIcon,BorderLayout.CENTER);
                viewArtistsButton[i] = new JButton("View Profile");
                viewArtistsButton[i].addActionListener(this);
                gridPanels[i].add(viewArtistsButton[i],BorderLayout.SOUTH);
                main.add(gridPanels[i]);
            }
            
            gridPanels[i].setBackground(Color.CYAN);
           


        }
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();

        if(source == viewArtistsButton[0])
        {
            JOptionPane.showMessageDialog(null,"digital");
        }else if(source == viewArtistsButton[1])
        {
            JOptionPane.showMessageDialog(null,"charcoal");
        }else if(source == viewArtistsButton[2])
        {
            JOptionPane.showMessageDialog(null,"landscape");
        }else
        {
            JOptionPane.showMessageDialog(null,"portrait");
        }



    }




}
