import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Categoria } from '../categoria.model';
import { CategoriaService } from '../categoria.service';

@Component({
  selector: 'app-categoria-delete',
  templateUrl: './categoria-delete.component.html',
  styleUrls: ['./categoria-delete.component.css']
})
export class CategoriaDeleteComponent implements OnInit {

  categoria: Categoria = {
    id: '',
    nome: '',
    descricao: ''
  }

  constructor(
    private serivce: CategoriaService,
    private route: ActivatedRoute,
    private router: Router
    ) { }

  ngOnInit() {
    this.categoria.id = this.route.snapshot.paramMap.get('id')
    this.findById();
  }

  findById(): void{
    this.serivce.findById(this.categoria.id).subscribe((resposta) => {
      this.categoria = resposta
    })
  }

  delete(): void {
    this.serivce.delete(this.categoria.id).subscribe((resposta) => {
      this.router.navigate(['categorias'])
      this.serivce.mensagem('Categoria excluída com sucesso!!!')
    }, err => {
      this.serivce.mensagem(err.error.error
      )
    })
  }

  cancel(): void{
    this.router.navigate(['categorias'])
  }

}
