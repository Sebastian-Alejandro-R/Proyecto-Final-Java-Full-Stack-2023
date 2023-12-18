

 
function limpiar() {

  /***400***/
  let t400 = document.getElementById('tiempo400');
  t400.innerHTML = '00:00:00'
  let tr400 = document.getElementById('tiempor400');
  tr400.innerHTML = '0:00';

  
  /***800***/
  let t800 = document.getElementById('tiempo800');
  t800.innerHTML = '00:00:00'
  let tr800 = document.getElementById('tiempor800');
  tr800.innerHTML = '0:00';

  
  /***1500***/
  let t1500 = document.getElementById('tiempo1500');
  t1500.innerHTML = '00:00:00'
  let tr1500 = document.getElementById('tiempor1500');
  tr1500.innerHTML = '0:00';
  
  
  /***5000***/
  let t5000 = document.getElementById('tiempo5000');
  t5000.innerHTML = '00:00:00'
  let tr5000 = document.getElementById('tiempor5000');
  tr5000.innerHTML = '0:00';

  
  /***10000***/
  let t10000 = document.getElementById('tiempo10000');
  t10000.innerHTML = '00:00:00'
  let tr10000 = document.getElementById('tiempor10000');
  tr10000.innerHTML = '0:00';
}



function calcularritmos() {
  let distancia =  parseFloat(document.getElementById('inputDistancia').value);

if (distancia > 0)  {


  let horas =  parseInt(document.getElementById('inputHoras').value);
  let minutos =  parseInt(document.getElementById('inputMinutos').value);
  let segundos =  parseInt(document.getElementById('inputSegundos').value);
 let segundostotalesintroducidos = segundos + (minutos*60)+(horas *3600)

 if (parseInt(segundostotalesintroducidos) == 0) {
  alert("introduzca un tiempo");
  return

 }






  /***400***/
  
  let tiempo400 = segundostotalesintroducidos*(Math.pow((400/distancia),1.06));
  let horasobtenidas400 =  Math.floor(tiempo400/3600);
  let minutosobtenidos400 =  Math.floor((tiempo400%3600)/60);
  let segundosobtenidos400 =  Math.floor((tiempo400-(horasobtenidas400*3600)-(minutosobtenidos400*60)));
  let t400 = document.getElementById('tiempo400');
  t400.innerHTML = horasobtenidas400.toString().padStart(2,'0') + ':' + minutosobtenidos400.toString().padStart(2,'0') + ':' + segundosobtenidos400.toString().padStart(2,'0') ;
  
  let tiempor400 = tiempo400/(400/1000);
  let horasobtenidasr400 =  Math.floor(tiempor400/3600);
  let minutosobtenidosr400 =  Math.floor((tiempor400%3600)/60);
  let segundosobtenidosr400 =  Math.floor((tiempor400-(horasobtenidasr400*3600)-(minutosobtenidosr400*60)));
  let tr400 = document.getElementById('tiempor400');
  tr400.innerHTML = horasobtenidasr400.toString().padStart(2,'0') + ':' + minutosobtenidosr400.toString().padStart(2,'0') + ':' + segundosobtenidosr400.toString().padStart(2,'0') ;
 


 /***800***/
  
 let tiempo800 = segundostotalesintroducidos*(Math.pow((800/distancia),1.06));
 let horasobtenidas800 =  Math.floor(tiempo800/3600);
 let minutosobtenidos800 =  Math.floor((tiempo800%3600)/60);
 let segundosobtenidos800 =  Math.floor((tiempo800-(horasobtenidas800*3600)-(minutosobtenidos800*60)));
 let t800 = document.getElementById('tiempo800');
 t800.innerHTML = horasobtenidas800.toString().padStart(2,'0') + ':' + minutosobtenidos800.toString().padStart(2,'0') + ':' + segundosobtenidos800.toString().padStart(2,'0') ;
 
 let tiempor800 = tiempo800/(800/1000);
 let horasobtenidasr800 =  Math.floor(tiempor800/3600);
 let minutosobtenidosr800 =  Math.floor((tiempor800%3600)/60);
 let segundosobtenidosr800 =  Math.floor((tiempor800-(horasobtenidasr800*3600)-(minutosobtenidosr800*60)));
 let tr800 = document.getElementById('tiempor800');
 tr800.innerHTML = horasobtenidasr800.toString().padStart(2,'0') + ':' + minutosobtenidosr800.toString().padStart(2,'0') + ':' + segundosobtenidosr800.toString().padStart(2,'0') ;




  /***1500***/
  
  let tiempo1500 = segundostotalesintroducidos*(Math.pow((1500/distancia),1.06));
  let horasobtenidas1500 =  Math.floor(tiempo1500/3600);
  let minutosobtenidos1500 =  Math.floor((tiempo1500%3600)/60);
  let segundosobtenidos1500 =  Math.floor((tiempo1500-(horasobtenidas1500*3600)-(minutosobtenidos1500*60)));
  let t1500 = document.getElementById('tiempo1500');
  t1500.innerHTML = horasobtenidas1500.toString().padStart(2,'0') + ':' + minutosobtenidos1500.toString().padStart(2,'0') + ':' + segundosobtenidos1500.toString().padStart(2,'0') ;
  
  let tiempor1500 = tiempo1500/(1500/1000);
  let horasobtenidasr1500 =  Math.floor(tiempor1500/3600);
  let minutosobtenidosr1500 =  Math.floor((tiempor1500%3600)/60);
  let segundosobtenidosr1500 =  Math.floor((tiempor1500-(horasobtenidasr1500*3600)-(minutosobtenidosr1500*60)));
  let tr1500 = document.getElementById('tiempor1500');
  tr1500.innerHTML = horasobtenidasr1500.toString().padStart(2,'0') + ':' + minutosobtenidosr1500.toString().padStart(2,'0') + ':' + segundosobtenidosr1500.toString().padStart(2,'0') ;
 

  /***5000***/
  
  let tiempo5000 = segundostotalesintroducidos*(Math.pow((5000/distancia),1.06));
  let horasobtenidas5000 =  Math.floor(tiempo5000/3600);
  let minutosobtenidos5000 =  Math.floor((tiempo5000%3600)/60);
  let segundosobtenidos5000 =  Math.floor((tiempo5000-(horasobtenidas5000*3600)-(minutosobtenidos5000*60)));
  let t5000 = document.getElementById('tiempo5000');
  t5000.innerHTML = horasobtenidas5000.toString().padStart(2,'0') + ':' + minutosobtenidos5000.toString().padStart(2,'0') + ':' + segundosobtenidos5000.toString().padStart(2,'0') ;
  
  let tiempor5000 = tiempo5000/(5000/1000);
  let horasobtenidasr5000 =  Math.floor(tiempor5000/3600);
  let minutosobtenidosr5000 =  Math.floor((tiempor5000%3600)/60);
  let segundosobtenidosr5000 =  Math.floor((tiempor5000-(horasobtenidasr5000*3600)-(minutosobtenidosr5000*60)));
  let tr5000 = document.getElementById('tiempor5000');
  tr5000.innerHTML = horasobtenidasr5000.toString().padStart(2,'0') + ':' + minutosobtenidosr5000.toString().padStart(2,'0') + ':' + segundosobtenidosr5000.toString().padStart(2,'0') ;
 

  /***10000***/
  
  let tiempo10000 = segundostotalesintroducidos*(Math.pow((10000/distancia),1.06));
  let horasobtenidas10000 =  Math.floor(tiempo10000/3600);
  let minutosobtenidos10000 =  Math.floor((tiempo10000%3600)/60);
  let segundosobtenidos10000 =  Math.floor((tiempo10000-(horasobtenidas10000*3600)-(minutosobtenidos10000*60)));
  let t10000 = document.getElementById('tiempo10000');
  t10000.innerHTML = horasobtenidas10000.toString().padStart(2,'0') + ':' + minutosobtenidos10000.toString().padStart(2,'0') + ':' + segundosobtenidos10000.toString().padStart(2,'0') ;
  
  let tiempor10000 = tiempo10000/(10000/1000);
  let horasobtenidasr10000 =  Math.floor(tiempor10000/3600);
  let minutosobtenidosr10000 =  Math.floor((tiempor10000%3600)/60);
  let segundosobtenidosr10000 =  Math.floor((tiempor10000-(horasobtenidasr10000*3600)-(minutosobtenidosr10000*60)));
  let tr10000 = document.getElementById('tiempor10000');
  tr10000.innerHTML = horasobtenidasr10000.toString().padStart(2,'0') + ':' + minutosobtenidosr10000.toString().padStart(2,'0') + ':' + segundosobtenidosr10000.toString().padStart(2,'0') ;
 


}
else alert("introduzca una distancia")
}

