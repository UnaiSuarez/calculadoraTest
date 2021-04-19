package DAO.DAOJugador;

import Clases.Jugador;
import db.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOJugadorDatabase implements DAOJugador{
    @Override
    public Jugador jugador() {
        Jugador jugador = null;
        try {
            Statement statement = DBConnection.getIstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from jugadores where nombre = 'unai'");
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                String password = resultSet.getString("contraseña");
                int saldo = resultSet.getInt("saldo");
                jugador = new Jugador(nombre, email, password, saldo);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return jugador;
        }
    }
