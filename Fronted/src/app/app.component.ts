import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app-clientes';

  nombre: string = 'Julian Quimbayo';

  asignatura: string = 'Programación Tres';
}
