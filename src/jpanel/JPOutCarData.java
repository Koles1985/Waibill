
package jpanel;


public class JPOutCarData extends javax.swing.JPanel {

    private javax.swing.JLabel jlabJPOCD_DataMileage;
    private javax.swing.JLabel jlabJPOCD_DataNameCar;
    private javax.swing.JLabel jlabJPOCD_DataStateNumber;
    private javax.swing.JLabel jlabJPOCD_Mileage;
    private javax.swing.JLabel jlabJPOCD_NameCar;
    private javax.swing.JLabel jlabJPOCD_StateNumder;
    
    
    
    public JPOutCarData() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jlabJPOCD_DataNameCar = new javax.swing.JLabel();
        jlabJPOCD_NameCar = new javax.swing.JLabel();
        jlabJPOCD_DataStateNumber = new javax.swing.JLabel();
        jlabJPOCD_StateNumder = new javax.swing.JLabel();
        jlabJPOCD_DataMileage = new javax.swing.JLabel();
        jlabJPOCD_Mileage = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Вывод данных об авто", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jlabJPOCD_DataNameCar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlabJPOCD_DataNameCar.setText("Автомобиль :");

        jlabJPOCD_NameCar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jlabJPOCD_NameCar.setText("Такой то такой автомобиль");

        jlabJPOCD_DataStateNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlabJPOCD_DataStateNumber.setText("Гос номер :");

        jlabJPOCD_StateNumder.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jlabJPOCD_StateNumder.setText("а000аа000");

        jlabJPOCD_DataMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlabJPOCD_DataMileage.setText("Пробег км :");

        jlabJPOCD_Mileage.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jlabJPOCD_Mileage.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabJPOCD_DataNameCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabJPOCD_NameCar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabJPOCD_DataStateNumber)
                        .addGap(18, 18, 18)
                        .addComponent(jlabJPOCD_StateNumder))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabJPOCD_DataMileage)
                        .addGap(18, 18, 18)
                        .addComponent(jlabJPOCD_Mileage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
    }// </editor-fold>                        


                        
    
                      
}