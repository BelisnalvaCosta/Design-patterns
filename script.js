// ===== Factory Pattern (Fábrica de Carros) =====
class Carro {
    constructor(modelo) {
        this.modelo = modelo;
    }

    exibirModelo() {
        return `🚘 Modelo: ${this.modelo}`;
    }
}

class CarroFactory {
    static criar(tipo) {
        if (tipo === 'popular') {
            return new Carro('Popular');
        } else if (tipo === 'esportivo') {
            return new Carro('Esportivo');
        }
    }
}

function criarCarro(tipo) {
    const carro = CarroFactory.criar(tipo);
    const div = document.getElementById('carros');
    const p = document.createElement('p');
    p.textContent = carro.exibirModelo();
    div.appendChild(p);
}

// ===== Strategy Pattern (Estratégia de Ataque) =====
class AtaqueEspada {
    executar() {
        return '🗡️ Atacando com espada!';
    }
}

class AtaqueArco {
    executar() {
        return '🏹 Atacando com arco!';
    }
}

class Personagem {
    setEstrategia(estrategia) {
        this.estrategia = estrategia;
    }

    atacar() {
        const resultado = this.estrategia.executar();
        document.getElementById('ataque').textContent = resultado;
    }
}

const personagem = new Personagem();

function setEstrategia(tipo) {
    if (tipo === 'espada') {
        personagem.setEstrategia(new AtaqueEspada());
    } else if (tipo === 'arco') {
        personagem.setEstrategia(new AtaqueArco());
    }
}