import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    loadChildren: () => import('./component/home/home.module').then( m => m.HomePageModule)
  },
  {
    path: 'logo',
    loadChildren: () => import('./component/logo/logo.module').then( m => m.LogoPageModule)
  },
  {
    path: 'ciudad',
    loadChildren: () => import('./component/ciudad/ciudad.module').then( m => m.CiudadPageModule)
  },
  {
    path: 'casos',
    loadChildren: () => import('./component/casos/casos.module').then( m => m.CasosPageModule)
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
