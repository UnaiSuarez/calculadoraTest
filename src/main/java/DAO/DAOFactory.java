package DAO;

import DAO.DAOJugador.DAOJugador;
import DAO.DAOJugador.DAOJugadorDatabase;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOJugador daoJugador;


    public static DAOFactory getInstance(){
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }


    public DAOJugador getDaoJugador(){
        if (daoJugador == null){
            daoJugador = new DAOJugadorDatabase();
        }
        return daoJugador;
    }
}
