package br.com.glaydstone.empresa.mb.padrao;

import br.com.glaydstone.empresa.modelo.exemplo.PessoaExemplo;
import br.com.glaydstone.empresa.modelo.controleacesso.Permissao;
import br.com.glaydstone.empresa.modelo.controleacesso.Usuario;
import br.com.glaydstone.empresa.modelo.configuracao.ErroSistema;
import br.com.glaydstone.empresa.modelo.controleacesso.SituacaoUsuario;
import br.com.glaydstone.empresa.modelo.controleacesso.AcessoSistema;
import br.com.glaydstone.empresa.modelo.email.ConfiguracaoEmail;
import br.com.glaydstone.empresa.modelo.controleacesso.Perfil;
import br.com.glaydstone.empresa.modelo.controleacesso.HistoricoSituacaoUsuario;
import br.com.glaydstone.empresa.modelo.email.ModeloEmail;
import br.com.glaydstone.empresa.modelo.controleacesso.SolicitacaoRecuperacaoSenha;
import br.com.glaydstone.empresa.modelo.email.TipoAssuntoEmail;
import br.com.glaydstone.empresa.modelo.controleacesso.TipoRecuperacaoSenha;
import br.com.glaydstone.empresa.modelo.software.Licenca;
import br.com.glaydstone.empresa.modelo.software.TipoSoftware;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClassMB {

    public Class getAcessoSistema() {
        return AcessoSistema.class;
    }

    public Class getErroSistema() {
        return ErroSistema.class;
    }

    public Class getHistoricoSituacaoUsuario() {
        return HistoricoSituacaoUsuario.class;
    }

    public Class getPerfil() {
        return Perfil.class;
    }

    public Class getPermissao() {
        return Permissao.class;
    }

    public Class getSituacaoUsuario() {
        return SituacaoUsuario.class;
    }

    public Class getUsuario() {
        return Usuario.class;
    }

    public Class getTipoAssuntoEmail() {
        return TipoAssuntoEmail.class;
    }

    public Class getModeloEmail() {
        return ModeloEmail.class;
    }

    public Class getSolicitacaoRecuperacaoSenha() {
        return SolicitacaoRecuperacaoSenha.class;
    }

    public Class getTipoRecuperacaoSenha() {
        return TipoRecuperacaoSenha.class;
    }

    public Class getConfiguracaoEmail() {
        return ConfiguracaoEmail.class;
    }
    public Class getPessoaExemplo() {
        return PessoaExemplo.class;
    }
    
    public Class getLicenca() {
        return Licenca.class;
    }
    public Class getTipoSoftware() {
        return TipoSoftware.class;
    }

}