
 package ma.projet.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
        (name = "id")
    private int id;

    @Column
        (name = "marque")
    private String marque;

    @Column
        (name = "reference")
    private String reference ;
   @Column
        (name = "dateAchat")
    private Date dateAchat;
@Column
        (name = "prix")
    private Double prix;
@Column
        (name = "designation")
    private String designation ;
    // Constructeurs, getters et setters

    public Produit() {}

    public Produit(String marque, String reference, Date dateAchat, double prix, String designation ) {
        this.marque=marque;
        this.reference=reference;
        this.dateAchat =dateAchat;
       this.prix = prix;
   this.designation=designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
public String getMarque() {
        return marque ;
    }

    public void setMarque(String marque) {
        this.marque= marque;
    }
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference= reference ;
    }
public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat ) {
        this.dateAchat = dateAchat;
    }
    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation ) {
        this.designation  = designation ;
    }
}

  

