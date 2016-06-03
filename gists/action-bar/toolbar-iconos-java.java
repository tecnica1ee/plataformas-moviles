// Buscamos la toolbar
Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
// Seteamos la toolbar para que funcione como una actionbar
setSupportActionBar(toolbar);
}

// Iconos de menu que los inflatamos como en un action bar
@Override
public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.iconos_barra, menu);
return true;
}
