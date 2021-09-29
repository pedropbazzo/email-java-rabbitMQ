package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
	public Object getStatusEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setSendDateEmail(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
	public String getEmailFrom() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getSubject() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmailFrom() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmailFrom() {
		// TODO Auto-generated method stub
		return null;
	}
}
