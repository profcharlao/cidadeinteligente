# 🚀 Configuração de Contas GitHub

## 🔑 Credenciais das Contas
### Conta PROFCHARLAO
- **User:** `profcharlao`
- **Email:** `profcharlao@hotmail.com`
- **SSH Key:** `id_ed25519`

### Conta CHARLESTHOMAZ
- **User:** `CharlesThomaz`
- **Email:** `charlesthomaz87@gmail.com`
- **SSH Key:** `id_ed25519_charles`

## ⚡ Comandos Rápidos
how! Se você quer:

Descobrir quais contas Git estão configuradas no seu sistema.

Usar cada conta sem depender de aliases como git-prof ou git-charles.

Então vamos fazer isso passo a passo, direto e simples:

✅ 1. Ver quais contas estão configuradas globalmente
Esse comando mostra a configuração global (aplicada a todos os repositórios):

bash
Copiar código
git config --global --list
Você verá algo como:

ini
Copiar código
user.name=CharlesThomaz
user.email=charlesthomaz87@gmail.com
Se estiver com outra conta, vai aparecer o nome e e-mail da outra.

✅ 2. Ver qual conta está ativa em um projeto específico
Dentro do repositório, use:

bash
Copiar código
git config user.name
git config user.email
Se não retornar nada, o Git está usando a configuração global.

✅ 3. Alternar entre contas manualmente (sem alias)
Para mudar a conta só nesse repositório (sem afetar os outros):

bash
Copiar código
git config user.name "profcharlao"
git config user.email "profcharlao@hotmail.com"
Depois, se quiser voltar para a outra conta:

bash
Copiar código
git config user.name "CharlesThomaz"
git config user.email "charlesthomaz87@gmail.com"
✅ 4. Garantir que cada conta use a chave SSH certa
Você já tem isso preparado no ~/.ssh/config com dois hosts diferentes:

bash
Copiar código
# Conta profcharlao
Host github.com
    HostName github.com
    User git
    IdentityFile ~/.ssh/id_ed25519
    IdentitiesOnly yes

# Conta CharlesThomaz
Host github.com-charles
    HostName github.com
    User git
    IdentityFile ~/.ssh/id_ed25519_charles
    IdentitiesOnly yes
Então, ao clonar o repositório de cada conta:

Para a conta profcharlao:


git clone git@github.com:profcharlao/repositorio.git
Para a conta CharlesThomaz:


git clone git@github.com-charles:CharlesThomaz/repositorio.git
O Git saberá automaticamente qual chave SSH usar sem precisar de alias.

✅ 5. Verificar qual conta está usada no push/pull
Dentro do repositório:


git remote -v
Você verá algo como:

origin  git@github.com:profcharlao/repositorio.git (fetch)
origin  git@github.com:profcharlao/repositorio.git (push)

Ou, para a outra conta:


origin  git@github.com-charles:CharlesThomaz/repositorio.git (fetch)
origin  git@github.com-charles:CharlesThomaz/repositorio.git (push)
 
