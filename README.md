📂 Sistema de Processamento de Arquivos CSV e Sumarização Automática
🎯 Sobre o Projeto

Este projeto demonstra o domínio em Data Streaming e I/O Management utilizando as capacidades modernas do Java 21. A solução foca na eficiência de memória ao processar grandes volumes de dados de produtos, realizando transformações financeiras e automatizando a gestão de diretórios no sistema de arquivos do sistema operacional.
🧠 Diferenciais Técnicos Aplicados

    Java 21 Runtime: Utilização das melhorias de performance da JVM mais recente.

    Pipeline de I/O de Alta Performance: Uso de BufferedReader e BufferedWriter para garantir que o processamento seja escalável, evitando carregar arquivos inteiros na memória RAM.

    Automação de Infraestrutura Local: O software é capaz de gerenciar o sistema de arquivos, criando diretórios de saída (/out) de forma inteligente.

    Princípio da Responsabilidade Única (SRP): Separação clara entre a lógica de entrada/saída (Main) e a regra de negócio do domínio (Product).

    Gerenciamento de Recursos Autônomo: Implementação do padrão try-with-resources, garantindo que streams sejam fechados mesmo em caso de falhas críticas, prevenindo corrupção de arquivos.

🛠️ Arquitetura e Design

A estrutura de pacotes foi desenhada para facilitar a manutenção e escalabilidade, seguindo padrões de projetos profissionais:
Plaintext

src/
 ├── application/
 │    └── Main.java         # Controller: Orquestra o fluxo de dados e I/O
 └── model/
      ├── entities/
           └── Product.java # Entity: Domínio com lógica de cálculo encapsulada

🚀 Fluxo de Execução

    Monitoramento de Caminho: Identifica o arquivo fonte .csv dinamicamente.

    Bootstrap de Ambiente: Verifica a existência e cria o diretório de destino /out.

    Data Extraction: Realiza o parsing manual de strings para tipos primitivos (double, int).

    Business Logic: Calcula o valor total de estoque por item através de métodos internos da entidade.

    Data Persistence: Persiste os dados sumarizados em um novo arquivo, mantendo a integridade dos dados originais.

📊 Especificações de Dados

Input Format (exemplo.csv):
Snippet de código

Apple TV,700.50,10
iPhone X,900.00,2

Output Format (summary.csv):
Snippet de código

Apple TV,7005.00
iPhone X,1800.00

⚙️ Requisitos

    JDK 21 ou superior.

    IDE de sua preferência (IntelliJ, Eclipse, VS Code).
