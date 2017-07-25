/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Николай
 */
public class JPInDataCar extends javax.swing.JPanel {
    
    //Font
    private Font normF = new Font("Times New Roman", 0, 14);
    
    //JLable
    private JLabel jlabJPIDC_Brend;//1
    private JLabel jlabJPIDC_ConsumptionSummer;//2
    private JLabel jlabJPIDC_ConsumptionWinter;//3
    private JLabel jlabJPID_CarStateNumber;//4
    private JLabel jlabJPIdC_Mileage;//5
    //JButton
    private javax.swing.JButton jbtnJPIDC_Cancel;
    private javax.swing.JButton jbtnJPIDC_Save;
   
    //JTextField
    private JTextField jtfJPIDC_Brend;//1
    private JTextField jtfJPIDC_CarStateNumber;//2
    private JTextField jtfJPIDC_ConsumptionSummer;//3
    private JTextField jtfJPIDC_ConsumptionWinter;//4
    private static JTextField jtfJPIDC_Mileage;//5
    
    //методы создания меток
    private JLabel jlab_Brend(){
        jlabJPIDC_Brend = new JLabel("Марка авто :");
        jlabJPIDC_Brend.setFont(normF);
        return jlabJPIDC_Brend;
    }
    private JLabel jlab_StateNumber(){
        jlabJPID_CarStateNumber = new JLabel("Гос. номер :");
        jlabJPID_CarStateNumber.setFont(normF);
        return jlabJPID_CarStateNumber;
    }
    private JLabel jlab_ConsSummer(){
        jlabJPIDC_ConsumptionSummer = new JLabel("Расход топлива летом :");
        jlabJPIDC_ConsumptionSummer.setFont(normF);
        return jlabJPIDC_ConsumptionSummer;
    }
    private JLabel jlab_ConsWinter(){
        jlabJPIDC_ConsumptionWinter = new JLabel("Расход топлива зимой :");
        jlabJPIDC_ConsumptionWinter.setFont(normF);
        return jlabJPIDC_ConsumptionWinter;
    }
    private JLabel jlab_Mileage(){
        jlabJPIdC_Mileage = new JLabel("Пробег :");
        jlabJPIdC_Mileage.setFont(normF);
        return jlabJPIdC_Mileage;
    }
    
    //методы создания JTextField
    private JTextField jtf_Brend(){
        jtfJPIDC_Brend = new JTextField();
        jtfJPIDC_Brend.setFont(normF);
        jtfJPIDC_Brend.setToolTipText("Введите марку авто.");
        return jtfJPIDC_Brend;
    }
    private JTextField jtf_StateNumber(){
        jtfJPIDC_CarStateNumber = new JTextField();
        jtfJPIDC_CarStateNumber.setFont(normF);
        jtfJPIDC_CarStateNumber.setToolTipText("Введите гос номер авто");
        return jtfJPIDC_CarStateNumber;
        
    }
    private JTextField jtf_Mileage(){
        jtfJPIDC_Mileage = new JTextField();
        jtfJPIDC_Mileage.setFont(normF); // NOI18N
        jtfJPIDC_Mileage.setToolTipText("Введите общий пробег авто");
        jtfJPIDC_Mileage.addKeyListener(new KeyAdapter(){
            
            
        });
        return jtfJPIDC_Mileage;
    }
    private JTextField jtf_ConsSummer(){
        jtfJPIDC_ConsumptionSummer = new JTextField();
        jtfJPIDC_ConsumptionSummer.setFont(normF); // NOI18N
        jtfJPIDC_ConsumptionSummer.setToolTipText("Введите количество расходуемого "
                + "топлива на 100 км. Летом");
        return jtfJPIDC_ConsumptionSummer;
    }
    private JTextField jtf_ConsWinter(){
        jtfJPIDC_ConsumptionWinter = new JTextField();
        jtfJPIDC_ConsumptionWinter.setFont(normF); // NOI18N
        jtfJPIDC_ConsumptionWinter.setToolTipText("Введите количество "
                + "расходуемого топлива на 100км. Зимой");
        return jtfJPIDC_ConsumptionWinter;
    }
    
    //JButton
    private JButton jbtn_Cancel(){
        jbtnJPIDC_Cancel = new JButton();
        jbtnJPIDC_Cancel.setFont(normF); // NOI18N
        jbtnJPIDC_Cancel.setText("Отмена");
        jbtnJPIDC_Cancel.setToolTipText("Отменить вводимые данные");
        return jbtnJPIDC_Cancel;
    }
    
    private JButton jbtn_Save(){
        jbtnJPIDC_Save = new JButton();
        jbtnJPIDC_Save.setFont(normF); // NOI18N
        jbtnJPIDC_Save.setText("Сохранить");
        jbtnJPIDC_Save.setToolTipText("Сохранить вводимые данные");
        return jbtnJPIDC_Save;
    }
    
    private void horisontalGroup(GroupLayout layout){
         this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtn_Save())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_Cancel()))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlab_Brend())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Brend(), javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlab_StateNumber())
                            .addComponent(jlab_Mileage()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_StateNumber())
                            .addComponent(jtf_Mileage())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlab_ConsSummer())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_ConsSummer()))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlab_ConsWinter())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_ConsWinter())))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    private void verticalGroup(GroupLayout layout){
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPIDC_Brend)
                    .addComponent(jtfJPIDC_Brend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPID_CarStateNumber)
                    .addComponent(jtfJPIDC_CarStateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPIdC_Mileage)
                    .addComponent(jtfJPIDC_Mileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPIDC_ConsumptionSummer)
                    .addComponent(jtfJPIDC_ConsumptionSummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabJPIDC_ConsumptionWinter)
                    .addComponent(jtfJPIDC_ConsumptionWinter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnJPIDC_Cancel)
                    .addComponent(jbtnJPIDC_Save)))
        );
    }
    
    public static JTextField getTFMileage(){
        return jtfJPIDC_Mileage;
    }
    
    
    public JPInDataCar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, 
                "Ввод данных об авто", 
                javax.swing.border.TitledBorder.CENTER, 
                javax.swing.border.TitledBorder.TOP, 
                new Font("Times New Roman", 1, 16))); // NOI18N

        GroupLayout layout = new GroupLayout(this);
        horisontalGroup(layout);
        verticalGroup(layout);
    }                                     
}
    