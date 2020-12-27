package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import dados.Homem;
import dados.Mulher;
import dados.Pessoa;

public class PessoaDAO {
	private Connection con = Conexao.getConnection();

	public void cadastrar(Pessoa pessoa) {
		String sql = "INSERT INTO pandemia.pessoa (nome,saude,gestante,idade) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, pessoa.getNome().toString());
			preparador.setString(2, pessoa.getSituacaoSaude());
			try {
				preparador.setString(3, ((Mulher) pessoa).getSituacaoGestante());
				preparador.setNull(4, java.sql.Types.INTEGER);
			} catch (ClassCastException e) {
				preparador.setString(3, null);
				preparador.setInt(4, ((Homem) pessoa).getIdade());
			}
			preparador.execute();
			preparador.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public ArrayList<Pessoa> listar() {
		ArrayList<Pessoa> grupo = new ArrayList<Pessoa>();
		String sql = "SELECT * FROM pessoa";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet lista = preparador.executeQuery();
			while (lista.next()) {
				StringBuilder aux = new StringBuilder();
				Integer codigo = lista.getInt("idPessoa");
				String gestante = lista.getString("gestante");
				String saude = lista.getString("saude");
				switch (saude) {
				case "T":
					saude = "contaminado(a) em tratamento";
					break;
				case "F":
					saude = "contaminado(a) falecido(a)";
					break;
				case "C":
					saude = "contaminado(a) curado(a)";
					break;
				case "S":
					saude = "sem contaminacao";
				}
				Integer idade = lista.getInt("idade");
				if (gestante == null)
					grupo.add(new Homem(aux.append(lista.getString("nome").toLowerCase()), saude, idade, codigo));
				else {
					if (gestante.equals("S"))
						gestante = "sim";
					else if (gestante.equals("N"))
						gestante = "nao";
					else if (gestante.equals("T"))
						gestante = "nao tem certeza";
					grupo.add(new Mulher(aux.append(lista.getString("nome").toLowerCase()), saude, gestante, codigo));
				}
			}
			preparador.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return grupo;
	}

	public Pessoa buscaID(int id) {
		Pessoa pessoa = null;
		String sql = "SELECT * FROM pessoa WHERE idPessoa like '%" + id + "%'";
		StringBuilder aux = new StringBuilder();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resposta = preparador.executeQuery();
			if (resposta.next()) {
				Integer codigo = resposta.getInt("idPessoa");
				String gestante = resposta.getString("gestante");
				String saude = resposta.getString("saude");
				Integer idade = resposta.getInt("idade");
				switch (saude) {
				case "T":
					saude = "contaminado(a) em tratamento";
					break;
				case "F":
					saude = "contaminado(a) falecido(a)";
					break;
				case "C":
					saude = "contaminado(a) curado(a)";
					break;
				case "S":
					saude = "sem contaminacao";
				}
				if (gestante == null)
					pessoa = new Homem(aux.append(resposta.getString("nome").toLowerCase()), saude, idade, codigo);
				else {
					if (gestante.equals("S"))
						gestante = "sim";
					else if (gestante.equals("N"))
						gestante = "nao";
					else if (gestante.equals("T"))
						gestante = "nao tem certeza";
					pessoa = new Mulher(aux.append(resposta.getString("nome").toLowerCase()), saude, gestante, codigo);
				}
			} else
				preparador.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return pessoa;
	}

	public ArrayList<Pessoa> buscaNomes(String nome) {
		ArrayList<Pessoa> grupo = new ArrayList<Pessoa>();
		String sql = "SELECT * FROM pessoa WHERE nome like '%" + nome + "%'";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet lista = preparador.executeQuery();
			while (lista.next()) {
				StringBuilder aux = new StringBuilder();
				Integer codigo = lista.getInt("idPessoa");
				String gestante = lista.getString("gestante");
				String saude = lista.getString("saude");
				switch (saude) {
				case "T":
					saude = "contaminado(a) em tratamento";
					break;
				case "F":
					saude = "contaminado(a) falecido(a)";
					break;
				case "C":
					saude = "contaminado(a) curado(a)";
					break;
				case "S":
					saude = "sem contaminacao";
				}
				Integer idade = lista.getInt("idade");
				if (gestante == null)
					grupo.add(new Homem(aux.append(lista.getString("nome").toLowerCase()), saude, idade, codigo));
				else {
					if (gestante.equals("S"))
						gestante = "sim";
					else if (gestante.equals("N"))
						gestante = "nao";
					else if (gestante.equals("T"))
						gestante = "nao tem certeza";
					grupo.add(new Mulher(aux.append(lista.getString("nome").toLowerCase()), saude, gestante, codigo));
				}
			}
			preparador.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return grupo;
	}

}
