
package jpanel;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JLabel;


public class JPOutCarData extends javax.swing.JPanel {
    
    private Font boldF = new Font("Times New Roman", 3, 14);
    private Font normF = new Font("Times New Roman", 0, 14);

    private JLabel jlabJPOCD_DataMileage;
    private JLabel jlabJPOCD_DataNameCar;
    private JLabel jlabJPOCD_DataStateNumber;
    private JLabel jlabJPOCD_Mileage;
    private JLabel jlabJPOCD_NameCar;
    private JLabel jlabJPOCD_StateNumder;
    
    // Эти не трогаем вообще за ненадобностью
    private JLabel createDNC(){
        jlabJPOCD_DataNameCar = new JLabel("Автомобиль :");
        jlabJPOCD_DataNameCar.setFont(normF); // NOI18N
        return jlabJPOCD_DataNameCar;
        
    }
    private JLabel createDSN(){
        jlabJPOCD_DataStateNumber = new JLabel("Гос номер :");
        jlabJPOCD_DataStateNumber.setFont(normF); // NOI18N
        return jlabJPOCD_DataStateNumber;
        
    }
    private JLabel createDM(){
        jlabJPOCD_DataMileage = new JLabel("Пробег км :");
        jlabJPOCD_DataMileage.setFont(normF); // NOI18N
        return jlabJPOCD_DataMileage;
        
    }
    
    
    //Эти выводят информацию
    private JLabel getNameCar(){
        jlabJPOCD_NameCar = new JLabel("Такой то такой автомобиль");
        jlabJPOCD_NameCar.setFont(boldF); // NOI18N
        return jlabJPOCD_NameCar;
    }
    private JLabel getStateNumber(){
        jlabJPOCD_StateNumder = new JLabel("а000аа000");
        jlabJPOCD_StateNumder.setFont(boldF); // NOI18N
        return jlabJPOCD_StateNumder;
        
    }
    private JLabel getMileage(){
        jlabJPOCD_Mileage = new JLabel("0");
        jlabJPOCD_Mileage.setFont(boldF); // NOI18N
        return jlabJPOCD_Mileage;
        
    }
    
    private void horisontG(GroupLayout layout){
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createDNC())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getNameCar()))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createDSN())
                        .addGap(18, 18, 18)
                        .addComponent(getStateNumber()))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createDM())
                        .addGap(18, 18, 18)
                        .addComponent(getMileage())))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    private void verticalG(GroupLayout layout){
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPOCD_DataNameCar)
                    .addComponent(jlabJPOCD_NameCar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPOCD_DataStateNumber)
                    .addComponent(jlabJPOCD_StateNumder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPOCD_DataMileage)
                    .addComponent(jlabJPOCD_Mileage)))
        );
    }
    
    
    
    public JPOutCarData() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, 
                "Вывод данных об авто", 
                javax.swing.border.TitledBorder.CENTER, 
                javax.swing.border.TitledBorder.TOP, 
                new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        GroupLayout layout = new GroupLayout(this);
        horisontG(layout);
        verticalG(layout);
    }                       


                        
    
                      
}