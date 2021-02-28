

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ExportarImportar {

//	protected Vaga vaga = new Vaga();

	public boolean exportarPessoa(List<Pessoa> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Pessoas.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Pessoa> importarPessoa(List<Pessoa> lista) throws IOException {
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Pessoas.json"));
			Type listType = new TypeToken<ArrayList<Pessoa>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}
        
        public boolean exportarSala(List<Sala> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Salas.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Sala> importarSala(List<Sala> lista) throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Salas.json"));
			Type listType = new TypeToken<ArrayList<Sala>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}
        
        public boolean exportarEspaco(List<Espaco> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Espacos.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Espaco> importarEspaco(List<Espaco> lista) throws IOException {
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Espacos.json"));
			Type listType = new TypeToken<ArrayList<Espaco>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}
}
/*
	public boolean exportarProprietario(List<Proprietario> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Proprietarios.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Proprietario> importarProprietario(List<Proprietario> lista) throws IOException {
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Proprietarios.json"));
			Type listType = new TypeToken<ArrayList<Proprietario>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}

	public boolean exportarVeiculo(List<Veiculo> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Veiculos.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Veiculo> importarVeiculo(List<Veiculo> lista) throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Veiculos.json"));
			Type listType = new TypeToken<ArrayList<Veiculo>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}

	public boolean exportarValores(List<Valor> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Historico de Valores.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Valor> importarValores(List<Valor> lista) throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Historico de Valores.json"));
			Type listType = new TypeToken<ArrayList<Valor>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}

	public boolean exportarVagas(List<Vaga> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Vagas.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Vaga> importarVagas(List<Vaga> lista) throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Vagas.json"));
			Type listType = new TypeToken<ArrayList<Vaga>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			for (int k = 0; k < 10; k++) {
				vaga.setNumeracao(lista.size() + 1);
				vaga.setOcupado("Livre");
				vaga.setReservada(false);
				lista.add(vaga);
				vaga = new Vaga();
			}
			exportarVagas(lista);
			return lista;
		}
	}

	public boolean exportarVeiculosEstacionados(List<VeiculosEstacionados> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Veiculos Estacionados.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<VeiculosEstacionados> importarVeiculosEstacionados(List<VeiculosEstacionados> lista)
			throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Veiculos Estacionados.json"));
			Type listType = new TypeToken<ArrayList<VeiculosEstacionados>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}

	public boolean exportarMarcasCadastradas(List<MarcasCadastradas> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Marcas Cadastradas.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<MarcasCadastradas> importarMarcasCadastradas(List<MarcasCadastradas> lista) throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Marcas Cadastradas.json"));
			Type listType = new TypeToken<ArrayList<MarcasCadastradas>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}

	public boolean exportarProprietarioFrequente(List<ProprietarioFrequente> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Proprietarios Frequentes.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<ProprietarioFrequente> importarProprietarioFrequente(List<ProprietarioFrequente> lista)
			throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Proprietarios Frequentes.json"));
			Type listType = new TypeToken<ArrayList<ProprietarioFrequente>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}

	public boolean exportarPreco(List<Preco> lista) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter("Jsons/Precos.json");
		writer.write(gson.toJson(lista));
		writer.close();
		return true;
	}

	public List<Preco> importarPreco(List<Preco> lista) throws IOException {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Jsons/Precos.json"));
			Type listType = new TypeToken<ArrayList<Preco>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);

			return lista;

		} catch (java.io.FileNotFoundException e) {
			return lista;
		}
	}

}
*/