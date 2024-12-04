

import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class SetupAccountArtist extends SetupAccountClient implements ActionListener 
{
    private JLabel typeOfArtistLabel = new JLabel("Type of artist");
    private JComboBox<String> typeOfArtist = new JComboBox<>();
    private String[] artists = 
    {
        "Digital Artist",
        "Charcoal Artist",
        "Landscape Artist",
        "Portrait Artist"
    };

    public SetupAccountArtist() 
    {
        setupLabel.setText("Setup your account as an Artist");
        
        for(String artist: artists)
            typeOfArtist.addItem(artist);

            typeOfArtistLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
            typeOfArtistLabel.setForeground(Color.BLACK);
            
            typeOfArtist.setMaximumSize(new Dimension(600, 40));
            typeOfArtist.setFont(new Font("Monospaced", Font.PLAIN, 14));     

            typeOfArtistLabel.setAlignmentX(LEFT_ALIGNMENT);
            typeOfArtist.setAlignmentX(LEFT_ALIGNMENT);
         
            pane2.add(usernameLabelRegister);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(usernameFieldRegister);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(emailLabelRegister);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(emailFieldRegister);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(passwordLabelRegister);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(passwordFieldRegister);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(confirmPasswordLabelRegiste);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(confirmPasswordFieldRegister);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(typeOfArtistLabel);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(typeOfArtist);
            pane2.add(Box.createRigidArea(new Dimension(0, 10)));
            pane2.add(registerButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String command = e.getActionCommand();      

        if(command.equals("signin"))
        {
            card.show(secondMain,command);
        }else if(command.equals("register"))
        {
            card.show(secondMain,command);    
        }
    
       if(source == registerButton)
       {
           String username = usernameFieldRegister.getText();
           char[] pass = passwordFieldRegister.getPassword();
           char[] confirmPass = confirmPasswordFieldRegister.getPassword();
           Client client = new Client();
           String password = "",confirmPassword = "";
           
           for(int i = 0;i < pass.length; ++i)
           {
               password += pass[i];
           }
           for(int i = 0;i < confirmPass.length; ++i)
           {
               confirmPassword += confirmPass[i];
           }
           
           if(password.equals(confirmPassword))
           {
                if(client.validateRegister(username, password))
                {
                    JOptionPane.showMessageDialog(null,"Account already existed");
                    usernameFieldRegister.setText("");
                    passwordFieldRegister.setText("");
                    emailFieldRegister.setText("");
                    confirmPasswordFieldRegister.setText("");
                }else
                {
                    new Artists(username,password);
                    JOptionPane.showMessageDialog(null,"Account created successfully!");
                    usernameFieldRegister.setText("");
                    passwordFieldRegister.setText("");
                    confirmPasswordFieldRegister.setText("");
     
                    card.show(secondMain,"signin");    
                }
             
           }         
           else
           {
               passwordFieldRegister.setText(""); 
               confirmPasswordFieldRegister.setText(""); 
               JOptionPane.showMessageDialog(null,"The password should be match");
           }
  
           
       }else if(source == goBack)
       {
           new FirstFrame();
           setVisible(false);
           
       }else if(source == signinButton)
       {
          
            Artists testCredentials = new Artists();
            char [] c = passwordFieldSignin.getPassword();
            String passwordSignin = "";
            for(int i = 0; i < c.length; ++i)
            passwordSignin += c[i];
     
           if(testCredentials.validateLogin(usernameFieldSignin.getText(), passwordSignin))
           {
                JOptionPane.showMessageDialog(null,"Login Successfully!");
                testCredentials.dashboardArtist();
                // new DashboardClient((String)usernameFieldSignin.getText());

                setVisible(false);
           }else{
                JOptionPane.showMessageDialog(null,"Invalid Credentials");
                // usernameFieldSignin.setText("");
                // passwordFieldSignin.setText("");
           }




          
           
       }
        
    }  



    
}
    
    
    
    
    


    
        
  
    
        
