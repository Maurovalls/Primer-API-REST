package com.example.practica.config;

import com.example.practica.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomReivsionListener implements RevisionListener {
    public void newRevision(Object revisionEntity){Revision revision = (Revision) revisionEntity;}
}
