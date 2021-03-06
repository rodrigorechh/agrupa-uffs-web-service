package br.com.agrupauffs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.agrupauffs.business.grupos.OperacoesGruposBusiness;
import br.com.agrupauffs.controller.parametros.AtualizaGrupo;
import br.com.agrupauffs.controller.parametros.AtualizaGrupoEstudoUsuario;
import br.com.agrupauffs.controller.parametros.AtualizaGrupoHorario;
import br.com.agrupauffs.controller.parametros.AtualizaUsuario;
import br.com.agrupauffs.controller.parametros.AtualizaUsuarioCurso;

@RequestMapping("update/")
@RestController
public class UpdateController {
  @Autowired
  OperacoesGruposBusiness operacoesGruposBusiness;

  @RequestMapping(value = "grupo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Boolean atualizaGrupo (@RequestBody AtualizaGrupo body) {
    return operacoesGruposBusiness.atualizaGrupo(body);
  }

  @RequestMapping(value = "grupo_horario", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean atualizaGrupo (@RequestBody AtualizaGrupoHorario body) {
  return operacoesGruposBusiness.atualizaGrupoHorario(body);
  }

  @RequestMapping(value = "grupo_estudo_usuario", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Boolean atualizaGrupoEstudoUsuario (@RequestBody AtualizaGrupoEstudoUsuario body) {
    return operacoesGruposBusiness.atualizaGrupoEstudoUsuario(body);
  }
  
  @RequestMapping(value = "usuario_cursos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean atualizaUsuarioCursos (@RequestBody AtualizaUsuarioCurso body) {
		return operacoesGruposBusiness.atualizaUsuarioCursos(body);
  }
  
  @RequestMapping(value = "usuario", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean atualizaUsuario (@RequestBody AtualizaUsuario body) {
		return operacoesGruposBusiness.atualizaUsuario(body);
	}
}
