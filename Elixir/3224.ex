jon = IO.gets("") |> String.trim()
doc = IO.gets("") |> String.trim()

if String.length(jon) >= String.length(doc) do
  IO.puts("go")
else
  IO.puts("no")
end
