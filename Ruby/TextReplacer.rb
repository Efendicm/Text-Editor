def inplace_edit(file, bak, &block)
    old_stdout = $stdout
    argf = ARGF.clone
  
    argf.argv.replace [file]
    argf.inplace_mode = bak
    argf.each_line do |line|
        yield line
    end
    argf.close
  
    $stdout = old_stdout
  end
    inplace_edit 'Program1ruby.txt', '.bak' do |line|
    line = line.gsub(/aa/,"0")
    line = line.gsub(/ac/,"1")
    line = line.gsub(/ag/,"2")
    line = line.gsub(/at/,"3")
    line = line.gsub(/ca/,"4")
    line = line.gsub(/cc/,"5")
    line = line.gsub(/cg/,"6")
    line = line.gsub(/ct/,"7")
    line = line.gsub(/ga/,"8")
    line = line.gsub(/gc/,"9")
    line = line.gsub(/gg/,"A")
    line = line.gsub(/gt/,"B")
    line = line.gsub(/ta/,"C")
    line = line.gsub(/tc/,"D")
    line = line.gsub(/tg/,"E")
    line = line.gsub(/tt/,"F")
    print line
  end
  