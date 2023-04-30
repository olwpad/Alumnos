package MatricesAlumnos;
import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.Border;
public class Matrices extends JFrame implements ActionListener,MouseListener{
    JLabel buscarEstudiante,mostrarEstudiante,mostrarNotas,mostrarCarrera,mostrarPromedio,mostrarPromedioLetras,mostrarError;
    JButton Limpiar, salir,buscar;
    JTextField buscadordedocumento;
    String primerNumero;
    String datosEstudiantes[][] = {
        {"51662369", "Sandra Milena Castellanos Marín", "Medicina", "VI", "3.5", "4.0", "3.3", "3.5"},
        {"80223220", "Luis Andrés Montoya Montoya", "Ingeniería de Telecomunicaciones", "IV", "3.0", "3.3", "4.2", "4.5"},
        {"79444555", "Francisco Martínez Marin", "Ingeniería de Alimentos", "III", "3.4", "4.5", "4.4", "3.0"},
        {"79001003", "Luis Francisco Castañeda Roa", "Ingeniería de Sistemas", "VIII", "3.3", "3.4", "4.5", "4.4"},
        {"79003003","Pedro José Pineda Pineda","Odontología","VI","4.0","4.1","3.9","4.5"},
        {"52900901","Ruth Paola Mahecha Mahecha","Odontología","VII","3.6","3.6","3.8","3.9"},
        {"26900345","Lucia Valderrama Pineda","Fisioterapia","VIII","4.4","4.5","4.1","3.1"},
        {"35676900","Mariela Lucia Olguín Ramírez","Medicina","V","3.0","3.1","4.6","3.7"},
        {"27101234","Lucila Peñaranda Peñaranda","Enfermería","II","2.5","4.6","3.4","4.6" },
        {"80231678","Milena Palacios Palacios","Ingeniería Mecánica","III","1.3","3.9","2.6","2.0"},
        {"1030617979","Luis Alberto Castellanos Frias","Odontología","VI","4.0","4.1","3.9","4.5"}, 
        {"1019066342","Nercy Aleidis Rengifo Rengifo","Fisioterapia","VII","3.6","3.6","3.8","3.9"},
        {"1014249436","Fabián Raúl Moreno Carvajal","Medicina","VIII","4.4","4.5","4.1","3.1"},
        {"1022380843","Jonathan Mauricio Baez Baez","Enfermería","V","3.0","3.1","4.6","3.7"},
        {"1012353083","Germán Dario Rodríguez Baez","Ingeniería Mecánica","II","2.5","4.6","3.4","4.6"},
        {"1030630231","Diego Fernando Giraldo Romero","Ingeniería de Petróleo","III","3.6","3.4","3.5","4.5"},
        {"1020765332","Luz Herminda Fonseca Daza","Psicología","VI","4.0","4.1","3.9","4.5"},
        {"1022357137","Rhonald Dahian Jiménez García","Ingeniería Civil","VI","3.5","4.0","3.3","3.5"},
        {"52263227","Edgar Andrés Bejarano Pérez","Ingeniería Civil","IV","3.0","3.3","4.2","4.5"},
        {"1013579638","Diego Fernando Bautista Gómez","Ingeniería Civil","III","3.4","4.5","4.4","3.0"},
        {"1030617989","Luis Alberto Jaime Hernández","Ingeniería  de Sistemas","II","4.0","4.1","3.9","4.5"},
        {"1019066342","Zabala Pereira Nercy Aleidys","Ingeniería Mecánica","V","3.0","3.3","4.2","4.5"},
        {"1014249436","Fabian Raul Duarte Serrano","Medicina","IV","3.6","3.6","3.8","3.9"},
        {"1022380843","Jhonatan Mauricio Rodríguez  C.","Ingeniería de Petróleos","I","3.4","4.5","4.4","3.0"},
        {"1012353083","German Dario González  Riaño","Ingeniería de Petróleos","III","3.4","4.5","4.4","3.0"},
        {"96040605441","Michael Duvan Beltran Salcedo","Medicina","IV","3.0","3.3","4.2","4.5"},
        {"1013641467","Romero Piña Dylan David","Fisioterapia","II","3.6","3.6","3.8","3.9"},
        {"1030632107","Ruben Dario Fuquene C.","Ingeniería Mecánica","V","3.0","3.3","4.2","4.5"},
        {"53072770","Maryory Cuesta Rodríguez","Ingeniería de Telecomunicaciones","IV","3.0","3.3","4.2","4.5"},
        {"1014245401","Cristian Camilo Ortiz Ortiz","Ingeniería de Telecomunicaciones","VI","2.0","3.1","4.8","1.5"},
        {"95070115361","Yuly Katherine Sierra","Ingeniería Mecánica","V","2.7","3.9","4.7","4.5"},
        {"1020796896","Daniel Andres Zapata Bello","Ingeniería Mecánica","IV","3.0","3.3","4.2","4.5"},
        {"1003819124","José Eitner Montiel  Aldana","Medicina","IV","3.0","3.3","4.2","4.5"},
        {"1031131906","Luis Guillermo Andrade Cifuentes","Medicina","VIII","3.9","3.8","2.6","4.5"},
        {"1019018284","Jairo Joel Noguera melo","Medicina","VIII","3.7","3.7","4.7","4.0"},
        {"1014218719","Bryan Andrés Ortegón","Medicina","IV","3.0","3.3","4.2","4.5"},
        {"1030611565","Mónica Andrea Plaza Bernal","Medicina","IV","3.6","3.8","4.8","4.0"}
        };
    public double promedioretorno(double a, double b,double c, double d){
        return (a+b+c+d)/4;
    }
    public String valor1(int a ){
        if(a==0)
            primerNumero="Cero";
        else if(a==1)
            primerNumero="Uno";
        else if(a==2)
            primerNumero="Dos";
        else if(a==3)
            primerNumero="Tres";
        else if(a==4)
            primerNumero="Cuatro";
        else if(a==5)
            primerNumero="Cinco";
        else if(a==6)
            primerNumero="Seis";
        else if(a==7)
            primerNumero="Siete";
        else if(a==8)
            primerNumero="Ocho";
        else
            primerNumero="Nueve";
        return primerNumero;
    }

    public  Matrices() {
        setLayout(null);
        buscarEstudiante= new JLabel("Buscar Estudiante");
        buscarEstudiante.setBounds(120,130,350,40);
        buscarEstudiante.setFont(new Font("impact", Font.BOLD, 40));
        buscarEstudiante.setForeground(new Color(42,133,185));
        add(buscarEstudiante);

        mostrarEstudiante= new JLabel("");
        mostrarEstudiante.setBounds(70,250,500,40);
        mostrarEstudiante.setFont(new Font("Rockwell", Font.BOLD, 19));
        mostrarEstudiante.setForeground(new Color(80,91,97));
        add(mostrarEstudiante);

        mostrarCarrera= new JLabel("");
        mostrarCarrera.setBounds(70,270,600,40);
        mostrarCarrera.setFont(new Font("Rockwell", Font.BOLD, 19));
        mostrarCarrera.setForeground(new Color(80,91,97));
        add(mostrarCarrera);

        mostrarNotas= new JLabel("");
        mostrarNotas.setBounds(70,290,400,40);
        mostrarNotas.setFont(new Font("Rockwell", Font.BOLD, 19));
        mostrarNotas.setForeground(new Color(80,91,97));
        add(mostrarNotas);

        mostrarPromedio= new JLabel("");
        mostrarPromedio.setBounds(70,310,400,40);
        mostrarPromedio.setFont(new Font("Rockwell", Font.BOLD, 19));
        mostrarPromedio.setForeground(new Color(80,91,97));
        add(mostrarPromedio);


        mostrarError= new JLabel("");
        mostrarError.setBounds(70,240,400,40);
        mostrarError.setFont(new Font("Rockwell", Font.BOLD, 19));
        mostrarError.setForeground(new Color(80,91,97));
        add(mostrarError);
        mostrarPromedioLetras= new JLabel("");
        mostrarPromedioLetras.setBounds(70,330,400,40);
        mostrarPromedioLetras.setFont(new Font("Rockwell", Font.BOLD, 19));
        mostrarPromedioLetras.setForeground(new Color(80,91,97));
        add(mostrarPromedioLetras);

        buscadordedocumento= new JTextField("Ingresa documento de identidad");
        buscadordedocumento.setBounds(70,200,420,40);
        Border border = BorderFactory.createLineBorder(new Color(196,217,231));
        buscadordedocumento.setFont(new Font("Rockwell", Font.BOLD, 12));
        buscadordedocumento.setBorder(border);
        buscadordedocumento.setForeground(Color.gray);
        add(buscadordedocumento);
        buscadordedocumento.addMouseListener(this);
        buscar = new JButton("Buscar");
        buscar.setBounds(500, 200, 150, 40);
        buscar.setFont(new Font("Rockwell", Font.BOLD, 19));
        buscar.setForeground(new Color(42,133,185));
        add(buscar);
        buscar.addActionListener(this);


        salir = new JButton("Salir");
        salir.setBounds(570, 400, 150, 40);
        salir.setFont(new Font("Rockwell", Font.BOLD, 19));
        salir.setForeground(new Color(42,133,185));
        add(salir);
        salir.addActionListener(this);
    }
    public void mouseExited(MouseEvent e) {
        if (buscadordedocumento.getText().equals("Ingresa documento de identidad")) {
            buscadordedocumento.setText("");
        }else if(buscadordedocumento.getText().equals("")){
            buscadordedocumento.setText("Ingresa documento de identidad");
        }

    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
        if (buscadordedocumento.getText().equals("Ingresa documento de identidad")) {
            buscadordedocumento.setText("");
        }
    } 
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {
    
    
    }
    
    public void actionPerformed(ActionEvent e) {
        // 
        if(e.getSource()==buscar){
            String documentoDeLaPersona=buscadordedocumento.getText();
            int i =0;
            while ( i < 37) {
                if (datosEstudiantes[i][0].equals(documentoDeLaPersona)) {
                    mostrarError.setText("");
                    String nombreDeEstudiantes = datosEstudiantes[i][1];
                    String carreraDeEstudiantes = datosEstudiantes[i][2];
                    String semestre = datosEstudiantes[i][3];
                    BigDecimal Precision = new BigDecimal(promedioretorno(Double.parseDouble(datosEstudiantes[i][4]) ,Double.parseDouble(datosEstudiantes[i][5]), Double.parseDouble(datosEstudiantes[i][6]) , Double.parseDouble(datosEstudiantes[i][7])));
                    BigDecimal precisionRedondeada = Precision.setScale(1, RoundingMode.FLOOR);
                    String NumeroEnString=String.valueOf(precisionRedondeada);
                    String[] CortedeNumero=NumeroEnString.split("\\.");
                    mostrarEstudiante.setText( "Estudiante: " + nombreDeEstudiantes );
                    mostrarCarrera.setText("Carrera: " + carreraDeEstudiantes + "  Semestre: " + semestre);
                    mostrarNotas.setText("Notas: "+datosEstudiantes[i][4]+", "+datosEstudiantes[i][5]+", " +datosEstudiantes[i][6]+", "+datosEstudiantes[i][7]);
                    mostrarPromedio.setText("Promedio: "+NumeroEnString);
                    mostrarPromedioLetras.setText(valor1(Integer.parseInt(CortedeNumero[0]))+" punto "+valor1(Integer.parseInt(CortedeNumero[1])));
                    break;
                }
                i++;
            }
        
            if (i==37) {
                if(documentoDeLaPersona.length()>1 && !documentoDeLaPersona.equals("Ingresa documento de identidad")){  
                mostrarEstudiante.setText("");
                mostrarCarrera.setText("");
                mostrarNotas.setText("");
                mostrarPromedio.setText("");
                mostrarPromedioLetras.setText("");
                buscadordedocumento.setText("");
                mostrarError.setText("No te encuentras en la base de datos"); }
                else{
                    mostrarError.setText("No ingresaste ningun valor");
                    mostrarEstudiante.setText("");
                mostrarCarrera.setText("");
                mostrarNotas.setText("");
                mostrarPromedio.setText("");
                mostrarPromedioLetras.setText("");
                }
            }
        
            
        }if(e.getSource()==salir){
            System.exit(0);
        }
    }




    public static void main(String[] args) {
        Matrices Gestion=new Matrices(); 
        Gestion.setBounds(20,20,750,500);
        Gestion.setVisible(true);
        Gestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gestion.setLocationRelativeTo(null);
        JPanel borde;
        borde= new JPanel();
        borde.setSize(750,500);
        borde.setBackground(new Color(222,229,234));
        borde.setBorder(BorderFactory.createLineBorder(Color.black));
        Gestion.getContentPane().add(borde);
        Gestion.setTitle("BuscarEstudiantes");
        Gestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    
  

}


